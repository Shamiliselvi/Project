package placement;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class placement_service_controller
{
	@Autowired(required=true)
	private placement_service service;
	@GetMapping("/placementservice")
	public java.util.List<placement> list()
	{
	return service.listAll();
	}
	@GetMapping("/placementservice/{st_id}")
	public ResponseEntity<placement> get(@PathVariable Integer St_id)
	{
	try
	{
	placement stud=service.get(St_id);
	return new ResponseEntity<placement>(stud,HttpStatus.OK);
	}
	catch(NoResultException e)
	{
	return new ResponseEntity<placement>(HttpStatus.NOT_FOUND);
	}
	}
	@PostMapping("/placementservice")
	public void add(@RequestBody placement stud)
	{
	service.save(stud);
	}
	@PutMapping("/placementservice/{st_id}")
	public ResponseEntity<?> update(@RequestBody placement stud, @PathVariable Integer
	St_id)
	{
	placement existstud=service.get(St_id);
	service.save(existstud);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/placementservice/{st_id}")
	public void delete(@PathVariable Integer st_id)
	{
	service.delete(st_id);
	}
}
