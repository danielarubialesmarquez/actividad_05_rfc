/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelRfc;
import views.ViewRFC;
import controllers.controllers;
/**
 *
 * @author Dani
 */
public class Main {
 private static ModelRfc modelrfc;
     private static controllers controllers;
     private static ViewRFC viewrfc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       modelrfc = new ModelRfc();
        viewrfc= new ViewRFC();
        controllers = new controllers(modelrfc,  viewrfc);
    }
    
}
