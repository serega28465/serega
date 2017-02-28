package ua.controller.admin;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.dto.filter.BasicFilter;
import ua.dto.filter.CommodityFilter;
import ua.dto.form.CommodityForm;
import ua.editor.CategoryEditor;
import ua.editor.ColorEditor;
import ua.editor.CountryEditor;
import ua.editor.MaterialEditor;
import ua.editor.MaterialsEditor;
import ua.editor.MechanikaEditor;
import ua.editor.ModelEditor;
import ua.editor.ProducerEditor;
import ua.entity.Category;
import ua.entity.Color;
import ua.entity.Country;
import ua.entity.Material;
import ua.entity.Materials;
import ua.entity.Mechanika;
import ua.entity.Producer;
import ua.service.CategoryService;
import ua.service.ColorService;
import ua.service.CommodityService;
import ua.service.CountryService;
import ua.service.MaterialService;
import ua.service.MaterialsService;
import ua.service.MechanikaService;
import ua.service.ModelService;
import ua.service.ProducerService;
import ua.service.SizeService;
import ua.validator.CommodityValidator;
import static ua.service.utils.ParamBuilder.getParams;
@Controller
@RequestMapping("/admin/commodity")
@SessionAttributes(names="commodity")
public class CommodityController{

	@Autowired
	private CommodityService commodityService;
	
	@Autowired
	private ColorService colorService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private MaterialService materialService;
	
	@Autowired
	private MaterialsService materialsService;
	
	@Autowired
	private MechanikaService mechanikaService;
	
	@Autowired
	private ModelService modelService;
	
	@Autowired
	private ProducerService producerService;
	
	@Autowired
	private SizeService sizeService;
	

	@InitBinder("commodity")
	protected void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Category.class, new CategoryEditor(categoryService));
		binder.registerCustomEditor(Producer.class, new ProducerEditor(producerService));
		binder.registerCustomEditor(Color.class, new ColorEditor(colorService));
		binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
		binder.registerCustomEditor(Material.class, new MaterialEditor(materialService));
		binder.registerCustomEditor(Mechanika.class, new MechanikaEditor(mechanikaService));
		binder.registerCustomEditor(Model.class, new ModelEditor(modelService));
		binder.registerCustomEditor(Producer.class, new ProducerEditor(producerService));
		binder.setValidator(new CommodityValidator());
	}
	
	@ModelAttribute("commodity")
	public CommodityForm getForm(){
		return new CommodityForm();
	}
	
	@ModelAttribute("filter")
	public CommodityFilter getFilter(){
		return new CommodityFilter();
	}
	
	@RequestMapping
	public String show(Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") CommodityFilter filter){
		model.addAttribute("page", commodityService.findAll(filter, pageable));
		model.addAttribute("producers", producerService.findAll());
		model.addAttribute("categorys", categoryService.findAll());
		model.addAttribute("colors", colorService.findAll());
		model.addAttribute("countrys", countryService.findAll());
		model.addAttribute("mechanikas", mechanikaService.findAll());
		model.addAttribute("models", modelService.findAll());
		model.addAttribute("sizes", sizeService.findAll());
		return "admin-commodity";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id, @PageableDefault Pageable pageable, @ModelAttribute("filter") CommodityFilter filter){
		commodityService.delete(id);
		return "redirect:/admin/commodity"+getParams(pageable, filter);
	}
	
	@RequestMapping("/add/{id}")
	public String showAdd(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") CommodityFilter filter){
		model.addAttribute("page", commodityService.findAll(filter, pageable));
		model.addAttribute("category", categoryService.findOne(id));
		model.addAttribute("producer", producerService.findOne(id));
		model.addAttribute("producers", producerService.findAll());
		model.addAttribute("categorys", categoryService.findAll());
		model.addAttribute("colors", colorService.findAll());
		model.addAttribute("countrys", countryService.findAll());
		model.addAttribute("mechanikas", mechanikaService.findAll());
		model.addAttribute("models", modelService.findAll());
		model.addAttribute("sizes", sizeService.findAll());
		model.addAttribute("producers", producerService.findAll());
		return "admin-commodity";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("commodity") @Valid CommodityForm commodity, BindingResult br, Model model, SessionStatus sessionStatus, @PageableDefault Pageable pageable, @ModelAttribute("filter") CommodityFilter filter){
		if(br.hasErrors()){
			show(model, pageable, filter);
			return "admin-commodity";
		}
		commodityService.save(commodity);
		sessionStatus.setComplete();
		return "redirect:/admin/commodity"+getParams(pageable, filter);
	}

	
	private String getParams(Pageable pageable, CommodityFilter filter){
		StringBuilder buffer = new StringBuilder();
		buffer.append("?page=");
		buffer.append(String.valueOf(pageable.getPageNumber()+1));
		buffer.append("&size=");
		buffer.append(String.valueOf(pageable.getPageSize()));
		if(pageable.getSort()!=null){
			buffer.append("&sort=");
			Sort sort = pageable.getSort();
			sort.forEach((order)->{
				buffer.append(order.getProperty());
				if(order.getDirection()!=Direction.ASC)
				buffer.append(",desc");
			});
		}
		if(!filter.getSearch().isEmpty()){
			buffer.append("&search=");
			buffer.append(filter.getSearch());
		}
		if(!filter.getMaxPrice().isEmpty()){
			buffer.append("&maxPrice=");
			buffer.append(filter.getMaxPrice());
		}
		if(!filter.getMinPrice().isEmpty()){
			buffer.append("&minPrice=");
			buffer.append(filter.getMinPrice());
		}
		for(Integer id : filter.getProducers()){
			buffer.append("&producers=");
			buffer.append(id);
		}
		for(Integer id : filter.getCategorys()){
			buffer.append("&categorys=");
			buffer.append(id);
		}
		
		
		return buffer.toString();

	}
}	
