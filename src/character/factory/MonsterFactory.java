package character.factory;

import character.Monster;
import room.Room;

import java.util.ArrayList;
import java.util.List;

public class MonsterFactory {
    public static Monster createEasyMonster() {
        Monster monsterFactoryEasy = new Monster();
        Monster spider = new Monster();

        spider.setHp(10);
        spider.setPower(1);
        spider.setDefence(1);

        List<Monster> easyMonsters = new ArrayList<>();

        easyMonsters.add(spider);
        easyMonsters.add(spider);
        easyMonsters.add(spider);

        monsterFactoryEasy.setMonsters(easyMonsters);
        return monsterFactoryEasy;
    }

    public static Monster createMediumMonster(){
        Monster monsterFactoryMedium = new Monster();
        Monster imp = new Monster();

        imp.setHp(50);
        imp.setPower(5);
        imp.setDefence(2);

        List<Monster> mediumMonsters = new ArrayList<>();

        mediumMonsters.add(imp);
        mediumMonsters.add(imp);
        mediumMonsters.add(imp);

        monsterFactoryMedium.setMonsters(mediumMonsters);
        return monsterFactoryMedium;
    }
    public static Monster createDifficultMonster(){
        Monster monsterFactoryDifficult = new Monster();
        Monster demon = new Monster();

        demon.setHp(100);
        demon.setPower(10);
        demon.setDefence(3);

        List<Monster> difficultMonsters = new ArrayList<>();

        difficultMonsters.add(demon);
        difficultMonsters.add(demon);

        monsterFactoryDifficult.setMonsters(difficultMonsters);
        return monsterFactoryDifficult;
    }
}
