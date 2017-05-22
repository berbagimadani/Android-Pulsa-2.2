package com.transaksi;

public class FormatRP {
	public static String getRupiahFormat(String number){            

        String displayedString = "";
        
        if(number.length() == 0){
            displayedString = "Rp. 0";
        }else{
            if(number.length()>3){
                int length = number.length();
                
                for(int i = length; i>0; i -=3){
                    if(i>3){
                        String myStringPrt1 = number.substring(0, i-3);
                        String myStringPrt2 = number.substring(i-3);
                        
                        String combinedString;
                        
                        combinedString = myStringPrt1 + ".";
                                                
                        combinedString += myStringPrt2;
                        number = combinedString;
                        
                        displayedString = "Rp. " + combinedString;
                    }
                }
            }else{
                displayedString = "Rp. " + number;
            }
        }
                
        return displayedString;
    }


}
