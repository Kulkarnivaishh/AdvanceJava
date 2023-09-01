package com.kiranacademy.warCurrentUR;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SoldierService;



@RestController
@RequestMapping("API")
public class BattleController {
	@Autowired
	A a;
	@Qualifier("createObjectOfA")
	A aaaa;
	
@Value("${val.age}")	
	int age;
@Autowired
BattleService battleservice ;//=new BattleService();
@Autowired
SoldierService soldierservice;
@RequestMapping("countdeath")
int deathcount () {
	System.out.println("age>>>>>>>>>>>>>>>"+age);
		return 6789;
	}
	
	@RequestMapping("soldiercount/{ctryname}")//4
	public int getSoldierCountAsPerCountry(@PathVariable String ctryname) {
	System.out.println(ctryname);
	if(ctryname.equals("russia")) {
		return 5000;
	}else {
		return 4000;
	}
	}
	@RequestMapping("insertsoldierinfo")//3
	public void addSoldier(@RequestBody Soldier soldier) {
	System.out.println(soldier);
	}
	@RequestMapping("insertguninfo")//2
	public void addGun(@RequestBody Gun gun) {
		System.out.println("--------"+gun);
		//jdbc insert db
	
	}
	@RequestMapping("fetchguninfo")//1
	public Gun getGunInfo () {
	BattleService battleservice =new BattleService();
	Gun gun=battleservice.getGunInfo();
	return gun ;
	}
	
@RequestMapping("hellouandr")
	String welcomeToBattleMessage() {
		return "Welcome you both Russia and Ukrain";
	}

@RequestMapping("soldeirinformation")
Soldier soldierInfo() {
	SoldierService service=new SoldierService();
	service.getInfo();
	Soldier SoldierInfo=new Soldier(23,"kharkiv",new Gun (100,"ak47"));

	return SoldierInfo ;
}
@RequestMapping("listsoldeirinformation")
ArrayList<Soldier> soldierInfoAll(){
ArrayList<Soldier> listSoldier=new ArrayList<Soldier>();
	Soldier SoldierInfo=new Soldier(23,"kharkiv",new Gun (100,"ak47"));
	Soldier Soldier1=new Soldier(23,"kieve",null);
	Soldier Soldier2=new Soldier(23,"kharkiv",new Gun (100,"ak47"));
	Soldier Soldier3=new Soldier(34,"mosco",new Gun (2,"shotgun"));
	Soldier Soldier4=new Soldier(45,"mosco",new Gun (1,"sniper"));
	listSoldier.add(Soldier1);
	listSoldier.add(Soldier2);
	listSoldier.add(Soldier3);
	listSoldier.add(Soldier4);
	return listSoldier;
}
}
