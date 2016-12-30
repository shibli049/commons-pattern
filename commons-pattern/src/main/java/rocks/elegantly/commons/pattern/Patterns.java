/*
 * Copyright (C) 2016 shibli
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package rocks.elegantly.commons.pattern;

import java.util.HashMap;

/**
 *
 * @author shibli
 */
public class Patterns {
    
    private Patterns(){
        
    }
    
    
    public static final String CREDIT_CARD = "[\\d]+((-|\\s)?[\\d]+)+";
    
    public static final String IP_V4 = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$";
    public static final String MAC = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";
    public static final String HEX_VALUE = "^#?([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$";
    public static final String SLUG = "^[a-z0-9-]+$";
    public static final String LATITUDE = "^(\\+|-)?(?:90(?:(?:\\.0{1,14})?)|(?:[0-9]|[1-8][0-9])(?:(?:\\.[0-9]{1,14})?))$";
    public static final String LONGITUDE = "^(\\+|-)?(?:180(?:(?:\\.0{1,14})?)|(?:[0-9]|[1-9][0-9]|1[0-7][0-9])(?:(?:\\.[0-9]{1,14})?))$";
    public static final String IRC = "(\\S*)!(\\S*)@(\\S*)";
    public static final String TIME_24H_FORMAT = "(24:00|2[0-3]:[0-5][0-9]|[0-1][0-9]:[0-5][0-9])";
    public static final String ISO_8601_DATETIME = "^(((\\d{4})([\\/-]?((0[1-9])|(1[012]))([\\/-]?((0[1-9])|([12]\\d)|(3[01])))?)?(?:T(([01][0-9])|(?:2[0123]))(\\:?([0-5][0-9])(\\:?([0-5][0-9]([\\,\\.]\\d{1,10})?))?)?(?:Z|([\\-+](?:([01][0-9])|(?:2[0123]))(\\:?(?:[0-5][0-9]))?))?)?))$";
    public static final String ISBN = "^(?:ISBN(?:-1[03])?:? )?(?=[-0-9 ]{17}$|[-0-9X ]{13}$|[0-9X]{10}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?(?:[0-9]+[- ]?){2}[0-9X]$";
    public static final String ROMAN_NUMERALS = "^(?=[MDCLXVI])M*(C[MD]|D?C*)(X[CL]|L?X*)(I[XV]|V?I*)$";
    public static final String BITCOIN_ADDRESS = "(?<![a-km-zA-HJ-NP-Z0-9])[13][a-km-zA-HJ-NP-Z0-9]{26,33}(?![a-km-zA-HJ-NP-Z0-9])";
    public static final String EMAIL_ADDRESS
            = "([a-z0-9!#$%&'*+\\/=?^_`\\{|.\\}~-]+@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?)";
    
    
    
    public static final HashMap<String, String> ZIP = new HashMap<>();
    public static final HashMap<String, String> PHONE_NUMBER = new HashMap<>();
    public static final HashMap<String, String> LICENSE_PLATE = new HashMap<>();
    
    static{
        
        ZIP.put("AD", "AD\\d{3}");
        ZIP.put("AM", "(37)?\\d{4}");
        ZIP.put("AR", "([A-HJ-NP-Z])?\\d{4}([A-Z]{3})?");
        ZIP.put("AS", "96799");
        ZIP.put("AT", "\\d{4}");
        ZIP.put("AU", "\\d{4}");
        ZIP.put("AX", "22\\d{3}");
        ZIP.put("AZ", "\\d{4}");
        ZIP.put("BA", "\\d{5}");
        ZIP.put("BB", "(BB\\d{5})?");
        ZIP.put("BD", "\\d{4}");
        ZIP.put("BE", "\\d{4}");
        ZIP.put("BG", "\\d{4}");
        ZIP.put("BH", "((1[0-2]|[2-9])\\d{2})?");
        ZIP.put("BM", "[A-Z]{2}[ ]?[A-Z0-9]{2}");
        ZIP.put("BN", "[A-Z]{2}[ ]?\\d{4}");
        ZIP.put("BR", "\\d{5}[\\-]?\\d{3}");
        ZIP.put("BY", "\\d{6}");
        ZIP.put("CA", "^[A-Z]\\d[A-Z] ?\\d[A-Z]\\d$");
        ZIP.put("CC", "6799");
        ZIP.put("CH", "\\d{4}");
        ZIP.put("CK", "\\d{4}");
        ZIP.put("CL", "\\d{7}");
        ZIP.put("CN", "[1-9]\\d{5}");
        ZIP.put("CR", "\\d{4,5}|\\d{3}-\\d{4}");
        ZIP.put("CS", "\\d{5}");
        ZIP.put("CV", "\\d{4}");
        ZIP.put("CX", "6798");
        ZIP.put("CY", "\\d{4}");
        ZIP.put("CZ", "\\d{3}[ ]?\\d{2}");
        ZIP.put("DE", "\\d{5}");
        ZIP.put("DK", "\\d{4}");
        ZIP.put("DO", "\\d{5}");
        ZIP.put("DZ", "\\d{5}");
        ZIP.put("EC", "([A-Z]\\d{4}[A-Z]|(?:[A-Z]{2})?\\d{6})?");
        ZIP.put("EE", "\\d{5}");
        ZIP.put("EG", "\\d{5}");
        ZIP.put("ES", "\\d{5}");
        ZIP.put("ET", "\\d{4}");
        ZIP.put("FI", "\\d{5}");
        ZIP.put("FO", "\\d{3}");
        ZIP.put("FR", "\\d{2}[ ]?\\d{3}");
        ZIP.put("GE", "\\d{4}");
        ZIP.put("GF", "9[78]3\\d{2}");
        ZIP.put("GL", "39\\d{2}");
        ZIP.put("GN", "\\d{3}");
        ZIP.put("GP", "9[78][01]\\d{2}");
        ZIP.put("GR", "\\d{3}[ ]?\\d{2}");
        ZIP.put("GS", "SIQQ 1ZZ");
        ZIP.put("GT", "\\d{5}");
        ZIP.put("GW", "\\d{4}");
        ZIP.put("HM", "\\d{4}");
        ZIP.put("HN", "(?:\\d{5})?");
        ZIP.put("HR", "\\d{5}");
        ZIP.put("HT", "\\d{4}");
        ZIP.put("HU", "\\d{4}");
        ZIP.put("ID", "\\d{5}");
        ZIP.put("IL", "\\d{5}");
        ZIP.put("IN", "\\d{6}");
        ZIP.put("IO", "BBND 1ZZ");
        ZIP.put("IQ", "\\d{5}");
        ZIP.put("IS", "\\d{3}");
        ZIP.put("IT", "\\d{5}");
        ZIP.put("JO", "\\d{5}");
        ZIP.put("JP", "\\d{3}-\\d{4}");
        ZIP.put("KE", "\\d{5}");
        ZIP.put("KG", "\\d{6}");
        ZIP.put("KH", "\\d{5}");
        ZIP.put("KR", "\\d{3}[\\-]\\d{3}");
        ZIP.put("KW", "\\d{5}");
        ZIP.put("KZ", "\\d{6}");
        ZIP.put("LA", "\\d{5}");
        ZIP.put("LK", "\\d{5}");
        ZIP.put("LR", "\\d{4}");
        ZIP.put("LS", "\\d{3}");
        ZIP.put("LT", "\\d{5}");
        ZIP.put("LU", "\\d{4}");
        ZIP.put("LV", "\\d{4}");
        ZIP.put("MA", "\\d{5}");
        ZIP.put("MC", "980\\d{2}");
        ZIP.put("MD", "\\d{4}");
        ZIP.put("ME", "8\\d{4}");
        ZIP.put("MG", "\\d{3}");
        ZIP.put("MK", "\\d{4}");
        ZIP.put("MN", "\\d{6}");
        ZIP.put("MQ", "9[78]2\\d{2}");
        ZIP.put("MT", "[A-Z]{3}[ ]?\\d{2,4}");
        ZIP.put("MU", "(\\d{3}[A-Z]{2}\\d{3})?");
        ZIP.put("MV", "\\d{5}");
        ZIP.put("MX", "\\d{5}");
        ZIP.put("MY", "\\d{5}");
        ZIP.put("NC", "988\\d{2}");
        ZIP.put("NE", "\\d{4}");
        ZIP.put("NF", "2899");
        ZIP.put("NG", "(\\d{6})?");
        ZIP.put("NI", "((\\d{4}-)?\\d{3}-\\d{3}(-\\d{1})?)?");
        ZIP.put("NL", "\\d{4}[ ]?[A-Z]{2}");
        ZIP.put("NO", "\\d{4}");
        ZIP.put("NP", "\\d{5}");
        ZIP.put("NZ", "\\d{4}");
        ZIP.put("OM", "(PC )?\\d{3}");
        ZIP.put("PF", "987\\d{2}");
        ZIP.put("PG", "\\d{3}");
        ZIP.put("PH", "\\d{4}");
        ZIP.put("PK", "\\d{5}");
        ZIP.put("PL", "\\d{2}-\\d{3}");
        ZIP.put("PM", "9[78]5\\d{2}");
        ZIP.put("PN", "PCRN 1ZZ");
        ZIP.put("PR", "00[679]\\d{2}([ \\-]\\d{4})?");
        ZIP.put("PT", "\\d{4}([\\-]\\d{3})?");
        ZIP.put("PW", "96940");
        ZIP.put("PY", "\\d{4}");
        ZIP.put("RE", "9[78]4\\d{2}");
        ZIP.put("RO", "\\d{6}");
        ZIP.put("RS", "\\d{6}");
        ZIP.put("RU", "\\d{6}");
        ZIP.put("SA", "\\d{5}");
        ZIP.put("SE", "\\d{3}[ ]?\\d{2}");
        ZIP.put("SG", "\\d{6}");
        ZIP.put("SH", "(ASCN|STHL) 1ZZ");
        ZIP.put("SI", "\\d{4}");
        ZIP.put("SJ", "\\d{4}");
        ZIP.put("SK", "\\d{3}[ ]?\\d{2}");
        ZIP.put("SM", "4789\\d");
        ZIP.put("SN", "\\d{5}");
        ZIP.put("SO", "\\d{5}");
        ZIP.put("SZ", "[HLMS]\\d{3}");
        ZIP.put("TC", "TKCA 1ZZ");
        ZIP.put("TH", "\\d{5}");
        ZIP.put("TJ", "\\d{6}");
        ZIP.put("TM", "\\d{6}");
        ZIP.put("TN", "\\d{4}");
        ZIP.put("TR", "\\d{5}");
        ZIP.put("TW", "\\d{3}(\\d{2})?");
        ZIP.put("UA", "\\d{5}");
        ZIP.put("US", "\\d{5}([ \\-]\\d{4})?");
        ZIP.put("UY", "\\d{5}");
        ZIP.put("UZ", "\\d{6}");
        ZIP.put("VA", "00120");
        ZIP.put("VE", "\\d{4}");
        ZIP.put("WF", "986\\d{2}");
        ZIP.put("XK", "\\d{5}");
        ZIP.put("YT", "976\\d{2}");
        ZIP.put("YU", "\\d{5}");
        ZIP.put("ZA", "\\d{4}");
        ZIP.put("ZM", "\\d{5}");        
        
        
        PHONE_NUMBER.put("FR", "^(?:\\+33|0)\\d{9}$");
        PHONE_NUMBER.put("IN", "\\d{10}");
        PHONE_NUMBER.put("BD", "^(?:\\+?88)?[\\s -]?01[\\s -]?[15-9][\\s -]?\\d{8}$");
        PHONE_NUMBER.put("ES", "^(?:\\+34|0)\\d{9}$");
        PHONE_NUMBER.put("TW", "^(?:\\+886|0)((?:9\\d{8})|(?:[2-8]\\d{7,8}))$");
        PHONE_NUMBER.put("NI", "(\\+?505)?\\d{8}");
        PHONE_NUMBER.put("US", "(1?)[\\s\\(-]{0,2}(\\d{3})[\\s\\)-]{0,2}(\\d{3})[\\s-]?(\\d{4})");
        
        
        
        LICENSE_PLATE.put("AD", "AD\\d{3}");
        LICENSE_PLATE.put("FR", "(^[A-Z]{2}-\\d{3}-[A-Z]{2}$)|(^\\d{1,4}\\s[A-Z]{1,3}\\s\\d{2}$)");
    }
    
    
   
}
