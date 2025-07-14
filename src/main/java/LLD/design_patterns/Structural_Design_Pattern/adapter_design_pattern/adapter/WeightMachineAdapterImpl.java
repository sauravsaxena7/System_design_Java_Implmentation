package LLD.design_patterns.Structural_Design_Pattern.adapter_design_pattern.adapter;

import LLD.design_patterns.Structural_Design_Pattern.adapter_design_pattern.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }


    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPound() *.45;
    }
}
