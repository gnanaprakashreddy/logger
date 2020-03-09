package org.example.homecost;

public class EstimateHomeCost {
    private int typeOfMaterial;
    private double houseArea;
    private boolean isAutomated;
    private double costEstimation;
    public EstimateHomeCost(int typeOfMaterial,double houseArea,boolean isAutomated){
        this.typeOfMaterial = typeOfMaterial;
        this.houseArea = houseArea;
        this.isAutomated = isAutomated;
        switch(this.typeOfMaterial){
            case 0: this.costEstimation = 1200;
                    break;
            case 1: this.costEstimation = 1500;
                    break;
            case 2: this.costEstimation = 1800;
                    break;
        }
        if(this.isAutomated){
            this.costEstimation += 700;
        }
    }
    public double Estimate(){
        return this.costEstimation * this.houseArea;
    }
}
