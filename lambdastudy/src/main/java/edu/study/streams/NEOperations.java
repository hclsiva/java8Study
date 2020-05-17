package edu.study.streams;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class NEOperations{
	public static void main(String[] args){
		List<Map<String,String>> ingressCosList = NERepository.getIngressCosList();
		System.out.println("IngressCosNEList = " +NERepository.getIngressCosList());
		
		List<Map<String,String>> filteredNEList = ingressCosList.stream().filter((Map m) -> !(m.get("NEID").equals("Device-0001"))).filter((Map m) -> !(m.get("NEID").equals("Device-0002"))).collect(Collectors.toList());
		System.out.println("filteredNEList = " + filteredNEList);
		
	}
}

class NERepository{
	
	public static List<Map<String,String>> getIngressCosList(){
		List<Map<String,String>> ingressCosMapList = new ArrayList(0);
		Map<String,String> ingressCosMap = new HashMap<String,String>();		
		ingressCosMap.put("NEID","Device-0001");
		ingressCosMapList.add(ingressCosMap);
		
		ingressCosMap = new HashMap<String,String>();		
		ingressCosMap.put("NEID","Device-0002");
		ingressCosMapList.add(ingressCosMap);
		
		ingressCosMap = new HashMap<String,String>();		
		ingressCosMap.put("NEID","Device-0003");
		ingressCosMapList.add(ingressCosMap);
		
		ingressCosMap = new HashMap<String,String>();		
		ingressCosMap.put("NEID","Device-0004");
		ingressCosMapList.add(ingressCosMap);
		
		ingressCosMap = new HashMap<String,String>();		
		ingressCosMap.put("NEID","Device-0005");
		ingressCosMapList.add(ingressCosMap);

		ingressCosMap = new HashMap<String,String>();		
		ingressCosMap.put("NEID","Device-0001");
		ingressCosMapList.add(ingressCosMap);	
		
		ingressCosMap = new HashMap<String,String>();		
		ingressCosMap.put("NEID","Device-0002");
		ingressCosMapList.add(ingressCosMap);
		
		return ingressCosMapList;
	}
	
}