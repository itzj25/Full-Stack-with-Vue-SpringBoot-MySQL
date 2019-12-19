package org.salem.domain.controller;

import java.util.List;

import org.salem.domain.Mapper.PetMapper;
import org.salem.domain.vo.PetVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
	@Autowired
	PetMapper petMapper;
	
	
	@RequestMapping("/showAllpets/{userNo}")
	public List<PetVO> showAllPets(@PathVariable int userNo){
		System.out.println("showAllPets 메소드 실행 ");
		return petMapper.showAllPets(userNo);
		
	}
	
	public List<PetVO> showPetDetail(int petNo){
		
		return null;
		
	}
	
	
	public int addPet(PetVO petVo) {
		
		return 0;
	}
	
	public int deletePet(int petNo) {
		return 0;
	}
	
	public int updatePet(int petNo) {
		
		return 0;
	}


}
