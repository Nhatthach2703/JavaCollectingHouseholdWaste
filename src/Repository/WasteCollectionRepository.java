/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.WasteCollectionDAO;
import java.util.List;

/**
 *
 * @author Xuan Vinh
 */
public class WasteCollectionRepository implements IWasteCollectionRepository{

    @Override
    public void display(List<Integer> stationList) {
        WasteCollectionDAO.Instance().display(stationList);
    }
    
}
