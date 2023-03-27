package Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.fabrici_concrete;



import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.Factory;
import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.Medic;
import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.PersonalSpital;

public class FactoryMedic implements Factory {

    @Override
    public PersonalSpital createPersonal(String name) {
        return new Medic(name);
    }


}
