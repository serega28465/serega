package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.dto.filter.BasicFilter;

import ua.entity.Mechanika;
import ua.repository.MachanikaRepository;
import ua.service.MechanikaService;
import ua.service.specification.CategorySpecification;
import ua.service.specification.MechanikaSpecification;

@Service
public class MechanikaServiceImpl implements MechanikaService{

	@Autowired
	private MachanikaRepository mechanikaRepository;

	@Override
	public Mechanika findOne(int id) {
		
		return mechanikaRepository.findOne(id);
	}

	@Override
	public List<Mechanika> findAll() {
		
		return mechanikaRepository.findAll();
	}

	@Override
	public void save(Mechanika mechanika) {
		mechanikaRepository.save(mechanika);
		
	}

	@Override
	public void delete(int id) {
		mechanikaRepository.delete(id);
		
	}

	@Override
	public Mechanika findByMechanika(String mechanika) {
		// TODO Auto-generated method stub
		return mechanikaRepository.findByMechanika(mechanika);
	}

	@Override
	public Page<Mechanika> findAll(BasicFilter filter, Pageable pageable) {
		// TODO Auto-generated method stub
		return mechanikaRepository.findAll(new MechanikaSpecification(filter), pageable);
	}
	
	
}
