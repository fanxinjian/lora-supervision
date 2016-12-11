package lorapp.supervision.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import lorapp.db.supervision.enity.SimpleSupervision;
import lorapp.db.supervision.repo.SimpleSupervisionRepo;

public class SimpleSupervisionService {

	HashMap<String, HashMap<String, SimpleSupervision>> simpleSuperMap = 
			new HashMap<String, HashMap<String, SimpleSupervision>>();
	
	public SimpleSupervisionService(@Autowired	SimpleSupervisionRepo simpleSupervision){
		
		for (SimpleSupervision simpleSuper : simpleSupervision.findAllByEnabled(true)) {
			HashMap<String, SimpleSupervision> devEuiSuper = new HashMap<String, SimpleSupervision>();
		}
	}
	
}
