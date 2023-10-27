/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.WasteCollectionRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xuan Vinh
 */
public class WasteCollectionProgram {
    List<Integer> stationList;
    WasteCollectionRepository program;

    public WasteCollectionProgram() {
        stationList = new ArrayList<Integer>();
        program = new WasteCollectionRepository();
    }

    public void run() {
        System.out.println("\tGarbage Collection");
        System.out.println("----------------------------------");
        program.display(stationList);
    }
}
