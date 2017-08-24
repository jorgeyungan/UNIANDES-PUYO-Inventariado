/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.beans;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.component.export.ExcelOptions;
import org.primefaces.component.export.PDFOptions;


@ManagedBean
public class archivopdf implements Serializable{

    private PDFOptions pdfOpt;

    public PDFOptions getPdfOpt() {
        return pdfOpt;
    }

    public void setPdfOpt(PDFOptions pdfOpt) {
        this.pdfOpt = pdfOpt;
    }
    
    public archivopdf() {
        pdfop();
        
    }
    private void pdfop() {
        
        pdfOpt = new PDFOptions();
        pdfOpt.setFacetBgColor("#07a5b5");
        pdfOpt.setFacetFontColor("#040404");
        pdfOpt.setFacetFontStyle("roman");
        pdfOpt.setFacetFontSize("8");
        pdfOpt.setCellFontColor("#040404");
        pdfOpt.setCellFontSize("8");
    }
    
    public void preProcessPDF(Object document) throws IOException, BadElementException, DocumentException {
        Document pdf = (Document) document;
        pdf.open();
        pdf.setPageSize(PageSize.A4);
 
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        String logo = externalContext.getRealPath("") + File.separator + "resources" + File.separator + "images" + File.separator + "uniandes.jpg";
         
        pdf.add(Image.getInstance(logo));
    }
}
