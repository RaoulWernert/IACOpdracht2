package nl.hu.iac.rest;

import nl.hu.iac.service.CalculationService;
import nl.hu.iac.service.ServiceProvider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calculate")
public class TrackRestService {
	
	@GET
	@Path("/car={carId}&cost={cost}")
	@Produces({MediaType.APPLICATION_JSON})
	public String Calculate(@PathParam("carId") String carId, @PathParam("carId") String cost) {
		CalculationService calculationService = ServiceProvider.getService();
		return calculationService.Calculate(carId, cost);
	}
}
