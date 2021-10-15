package Factory;

import vo.Electronic;
import vo.ElectronicType;
import vo.Tv;
import vo.VideoGame;

public class LivingRoomApplianceFactory implements AbstractFactory {

    @Override
    public Electronic getElectronic(ElectronicType electronicType) {
        if(ElectronicType.TV.equals(electronicType)){
            return new Tv();
        } else if(ElectronicType.VIDEOGAME.equals(electronicType)){
            return new VideoGame();
        } else {
            return null;
        }
    }
}
