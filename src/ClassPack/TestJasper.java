/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPack;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.Holder;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author danushka
 */
public class TestJasper {
    
    
    public static void main(String[] args) {
        
        TestJasper testJasper = new TestJasper();
        testJasper.loadjas();
        
    }

    private void loadjas() {
       try {
            List<KOTHolder> data = new ArrayList<KOTHolder>();
            List<KotDataHolder> Kotdata = new ArrayList<KotDataHolder>();
            
            KOTHolder holder = new KOTHolder();
            holder.setProducts("Product 01");
            holder.setCost(150);
            holder.setOrder("01");
       
            
            
            KOTHolder holder1 = new KOTHolder();
            holder1.setProducts("Product 02");
            holder1.setCost(250);
            holder1.setOrder("01");
           
           
            KOTHolder holder2 = new KOTHolder();
            holder2.setProducts("Product 02");
            holder2.setCost(250);
            holder2.setOrder("01");
       
            
            
            KotDataHolder kd =  new KotDataHolder();
            kd.setKotNo("KOT01");
            
            KotDataHolder kd0 =  new KotDataHolder();
            kd0.setKotNo("KOT01");
            
            Kotdata.add(kd);
            Kotdata.add(kd0);
            
            data.add(holder);
            data.add(holder1);
            data.add(holder2);
            
            System.out.println(data.get(0));
            
            JRBeanCollectionDataSource bcd = new JRBeanCollectionDataSource(data);
            JRBeanCollectionDataSource bcd0 = new JRBeanCollectionDataSource(Kotdata);
            Map<String, Object> mp = new HashMap();
            
            mp.put("Bean", bcd);
//            mp.put("KOTBean", bcd0);
            System.out.println(mp);
            
            InputStream input = getClass().getResourceAsStream("/JReports/Ceyesta_KOT.jrxml");
            
            
            JasperReport jr = JasperCompileManager.compileReport(input);
            
            
            JasperPrint jp = JasperFillManager.fillReport(jr, mp, bcd);
            
            JasperViewer.viewReport(jp);
        } catch (JRException ex) {
            Logger.getLogger(TestJasper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
        
    
    

