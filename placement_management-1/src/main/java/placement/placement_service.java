package placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class placement_service 
{
	@Autowired
	private placement_service_repository repo;
	public List<placement> listAll()
	{
	return repo.findAll();
	}
	public void save(placement stud)
	{
	repo.save(stud);
	}
	public placement get(Integer st_id)
	{
	return repo.findById(st_id).get();
	}
	public void delete(Integer st_id)
	{
	repo.deleteById(st_id);
	}
}
