package jp.ac.uryukyu.ie.e235721;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeaponSkill() {
        int finalEnemyHp = 10;

        Warrior warrior = new Warrior("デモ戦士", 100,20);
        Enemy enemy = new Enemy("スライムもどき", 100, 10);
        
        for(int i = 0; i < 3; i++) {
            warrior.attackWithWeaponSkill(enemy);
        }
        
        assertEquals(finalEnemyHp, enemy.getHitPoint());
    }
}
