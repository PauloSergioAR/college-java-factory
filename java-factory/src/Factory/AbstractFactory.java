package Factory;
import vo.Electronic;
import vo.ElectronicType;

public interface AbstractFactory {
    Electronic getElectronic(ElectronicType electronicType);
}