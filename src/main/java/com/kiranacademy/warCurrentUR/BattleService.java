package com.kiranacademy.warCurrentUR;

import org.springframework.stereotype.Component;

@Component
public class BattleService {
	
	public Gun getGunInfo() {
		System.out.println(" i am in service");
	Gun gun=new Gun();
	gun.setCountofBullets(34);
	gun.setTypeofGun("RIFLE");
return gun;

}
}

