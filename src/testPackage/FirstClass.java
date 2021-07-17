package testPackage;

import mypackage1.Dog;     //при использовании класса из другого пакета - обязательно его необходимо импортировать

public class FirstClass /*todo extends Animals*/ {       //если объявить наследование от Энималс - можно будет использовать даже protected доступ из класса родителя, даже если он в другом пакете
    void method() {
        Dog dog = new Dog();
        dog.var = 15;
        /*todo var = 10;*/       // для protected находящегося в родительском классе (extends Animals)
    }
}
