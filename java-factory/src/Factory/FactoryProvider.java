package Factory;

import vo.ElectronicFactoryType;

public class FactoryProvider {
    public static AbstractFactory getElectronicFactory(ElectronicFactoryType factoryType){
        if(ElectronicFactoryType.KITCHEN_APPLIANCE_FACTORY.equals(factoryType)) {
            return new KitchenAppliaceFactory();
        } else if(ElectronicFactoryType.LIVING_ROOM_APPLIANCE_FACTORY.equals(factoryType)){
            return new LivingRoomApplianceFactory();
        } else {
            return null;
        }
    }
}
