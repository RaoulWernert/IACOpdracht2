package nl.hu.iac.rest;

import nl.hu.iac.service.Car;
import nl.hu.iac.service.ServiceProvider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/calculate")
public class RestService {
	
	@GET
	@Path("/car={carId}&cost={cost}")
	@Produces({MediaType.APPLICATION_JSON})
	public String Calculate(@PathParam("carId") String carId, @PathParam("carId") String cost) {
		return ServiceProvider.getService().Calculate(carId, cost);
	}

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Car> getAllConsumption() {
		return ServiceProvider.getService().getAll();
	}
}