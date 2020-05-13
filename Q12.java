package com.daixia.leetcode;

public class Q12 {
    public String intToRoman(int num) {
        String[] res = new String[10];
        int i=0;
        while(num>0){
            int temp = num%10;
            int p = (int)Math.pow(10,i);
            if(temp<4){
                StringBuilder roman = new StringBuilder();
                switch(p){
                    case 1:
                        for(int j=0; j<temp; j++){
                            roman.append("I");
                        }
                        res[i] = roman.toString();
                        break;
                    case 10:
                        for(int j=0; j<temp; j++){
                            roman.append("X");
                        }
                        res[i] = roman.toString();
                        break;
                    case 100:
                        for(int j=0; j<temp; j++){
                            roman.append("C");
                        }
                        res[i] = roman.toString();
                        break;
                    case 1000:
                        for(int j=0; j<temp; j++){
                            roman.append("M");
                        }
                        res[i] = roman.toString();
                        break;
                }
            }else if(temp == 4){
                switch(p){
                    case 1:
                        res[i] = "IV";break;
                    case 10:
                        res[i] = "XL";break;
                    case 100:
                        res[i] = "CD";break;
                }
            }else if(temp >= 5 && temp<9){
                StringBuilder roman = new StringBuilder();
                switch(p){
                    case 1:
                        roman.append("V");
                        for(int j=0; j<temp-5; j++){
                            roman.append("I");
                        }
                        res[i] = roman.toString();
                        break;
                    case 10:
                        roman.append("L");
                        for(int j=0; j<temp-5; j++){
                            roman.append("X");
                        }
                        res[i] = roman.toString();
                        break;
                    case 100:
                        roman.append("D");
                        for(int j=0; j<temp-5; j++){
                            roman.append("C");
                        }
                        res[i] = roman.toString();
                        break;
                }
            }else{
                switch(p){
                    case 1:
                        res[i] = "IX";break;
                    case 10:
                        res[i] = "XC";break;
                    case 100:
                        res[i] = "CM";break;
                }
            }
            i++;
            num/=10;
        }
        StringBuilder finalRes = new StringBuilder();
        for(int k=i-1;k>=0;k--){
            finalRes.append(res[k]);
        }
        return finalRes.toString();
    }
}
