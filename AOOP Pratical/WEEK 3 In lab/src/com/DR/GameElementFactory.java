package com.DR;

public interface GameElementFactory {
	Enemy createEnemy();
    Weapon createWeapon();
    PowerUp createPowerUp();
}

