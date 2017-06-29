package com.robbievee.it.webapp.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BusStop {

   private String codeStop;
   private String name;
   private String terminalCode;
   
  
  public String getCodeStop() {
    return codeStop;
  }
  
  public void setCodeStop(String codeStop) {
    this.codeStop = codeStop;
  }


  
  public String getName() {
    return name;
  }


  
  public void setName(String name) {
    this.name = name;
  }


  
  public String getTerminalCode() {
    return terminalCode;
  }


  
  public void setTerminalCode(String terminalCode) {
    this.terminalCode = terminalCode;
  }
   
}
