package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Mechanika;
import ua.repository.MachanikaRepository;
import ua.service.MechanikaService;

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
	
	
}
