package Factory;

import vo.Electronic;
import vo.ElectronicType;
import vo.Fridge;
import vo.Stove;

public class KitchenAppliaceFactory implements AbstractFactory {

    @Override
    public Electronic getElectronic(ElectronicType electronicType) {
        if(ElectronicType.STOVE.equals(electronicType)){
            return new Stove();
        } else if(ElectronicType.FRIDGE.equals(electronicType)){
            return new Fridge();
        } else {
            return null;
        }
    }
}
