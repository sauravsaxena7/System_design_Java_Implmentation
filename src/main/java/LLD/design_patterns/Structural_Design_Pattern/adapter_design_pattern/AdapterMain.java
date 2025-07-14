package LLD.design_patterns.Structural_Design_Pattern.adapter_design_pattern;


import LLD.design_patterns.Structural_Design_Pattern.adapter_design_pattern.adapter.WeightMachineAdapter;
import LLD.design_patterns.Structural_Design_Pattern.adapter_design_pattern.adapter.WeightMachineAdapterImpl;

public class AdapterMain {
    public static void main(String[] args){
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }

}
