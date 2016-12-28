/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocks.elegantly.commons.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author shibli
 */
public class PatternsTest {

    @Test
    public void zipCodeUS() {
        //given
        String regex = Patterns.ZIP.get("US");

        //when
        String value = "12345 1234";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void emailSimple() {
        //given
        String regex = Patterns.EMAIL_ADDRESS;

        //when
        String value = "shibli@example.rocks";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void emailComplex() {
        //given
        String regex = Patterns.EMAIL_ADDRESS;

        //when
        String value = "shibli.alas+.test@example.rocks";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void emailComplexFail() {
        //given
        String regex = Patterns.EMAIL_ADDRESS;

        //when
        String value = "shibli.alas+.test@gl@example.rocks";

        //then
        Assert.assertFalse(Pattern.matches(regex, value));

    }

    @Test
    public void macAddress() {
        //given
        String regex = Patterns.MAC;

        //when
        String value = "00:08:C7:1B:8C:02";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void creditCard() {
        //given
        String regex = Patterns.CREDIT_CARD;

        //when
        String value = "3519 2073 7960 3241";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void creditCard2() {
        //given
        String regex = Patterns.CREDIT_CARD;

        //when
        String value = "35192073729324";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void creditCard3() {
        //given
        String regex = Patterns.CREDIT_CARD;

        //when
        String value = "3519-2073-7960-3241";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void creditCard4() {
        //given
        String regex = Patterns.CREDIT_CARD;

        //when
        String value = "3519-20737960-3241";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void creditCard5() {
        //given
        String regex = Patterns.CREDIT_CARD;

        //when
        String value = "3519-207379-3241";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void ipv41() {
        //given
        String regex = Patterns.IP_V4;

        //when
        String value = "0.0.0.0";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void ipv42() {
        //given
        String regex = Patterns.IP_V4;

        //when
        String value = "001.002.003.004";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void ipv43() {
        //given
        String regex = Patterns.IP_V4;

        //when
        String value = "209.18.181.23";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void hex1() {
        //given
        String regex = Patterns.HEX_VALUE;

        //when
        String value = "#a3C113";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void hex2() {
        //given
        String regex = Patterns.HEX_VALUE;

        //when
        String value = "#a3C";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void bitcoin() {
        //given
        String regex = Patterns.BITCOIN_ADDRESS;

        //when
        String value = "1BoatSLRHtKNngkdXEeobR76b53LETtpyT";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void longitude() {
        //given
        String regex = Patterns.LONGITUDE;

        //when
        String value = "112.1844026051194";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void latitude() {
        //given
        String regex = Patterns.LATITUDE;

        //when
        String value = "-66.4214188124611";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void usPhone() {

        //given
        String regex = Patterns.PHONE_NUMBER.get("US");

        //when
        String value = "12345678901";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));
    }

    @Test
    public void usPhone2() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("US");

        //when
        String value = "2345678901";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void usPhoneMixed() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("US");

        //when
        String value = "1 (234) 567-8901";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void usPhoneSpace() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("US");

        //when
        String value = "1 234 567 8901";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void usPhoneDash() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("US");

        //when
        String value = "1-234-567-8901";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void usPhoneNegative() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("US");

        //when
        String value = "-567-8901";

        //then
        Assert.assertFalse(Pattern.matches(regex, value));

    }

    @Test
    public void niPhone() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("NI");

        //when
        String value = "88888888";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void niPhone2() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("NI");

        //when
        String value = "+50588888888";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void bdPhone1() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("BD");

        //when
        String value = "01914546080";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void bdPhone2() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("BD");

        //when
        String value = "+8801914546080";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void bdPhone3() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("BD");

        //when
        String value = "+88 019 14546080";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void bdPhone4() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("BD");

        //when
        String value = "+88 019-14546080";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void twPhone1() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("TW");

        //when
        String value = "0220152016";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void twPhone2() {
        //given
        String regex = Patterns.PHONE_NUMBER.get("TW");

        //when
        String value = "+886912345678";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void time24h() {
        //given
        String regex = Patterns.TIME_24H_FORMAT;

        //when
        String[] values = {"23:45", "13:04", "09:22", "00:00", "24:00"};

        //then
        for (String value : values) {
            Assert.assertTrue(Pattern.matches(regex, value));
        }

    }

    @Test
    public void timeISO() {
        //given
        String regex = Patterns.ISO_8601_DATETIME;

        //when
        String value = "2014-12-05T12:30:45.123456-05:30";

        //then
        Assert.assertTrue(Pattern.matches(regex, value));

    }

    @Test
    public void isbn() {
        //given
        String regex = Patterns.ISBN;

        //when
        String[] values = {
            "ISBN-13: 978-1-56619-909-4",
            "ISBN-13: 978 5 93286 159 2",
            "978-1-56619-909-4",
            "ISBN-10: 1-56619-909-3",
            "1-56619-909-3",
            "978 1 56619 909 4",
            "1 56619 909 3"
        };

        //then
        for (String value : values) {
            Assert.assertTrue(Pattern.matches(regex, value));
        }

    }

    @Test
    public void frenchLicense() {
        //given
        String regex = Patterns.LICENSE_PLATE.get("FR");

        //when
        String[] values = {
            "AA-001-AA",
            "AA-555-AA",
            "AA-999-AA",
            "AA-001-AB",
            "AA-001-QQ",
            "AA-999-AZ",
            "AA-001-BA",
            "AA-999-ZZ",
            "AB-001-AA",
            "AZ-999-ZZ",
            "BA-001-AA",
            "ZZ-999-ZZ",
            "1 A 00",
            "999 Z 00",
            "1 AA 00",
            "999 PZ 00",
            "1 QA 00",
            "9999 ZZ 00",
            "11 AAA 00",
            "999 ZZZ 00"
        };

        //then
        for (String value : values) {
            Assert.assertTrue(Pattern.matches(regex, value));
        }

    }

    @Test
    public void frenchInvalidLicense() {
        //given
        String regex = Patterns.LICENSE_PLATE.get("FR");

        //when
        String[] values = {
            "A-011-DC",
            "DE-23-DE",
            "DF-532-3D",
            "1E-123-FD",
            "A A 00",
            "999 4 00",
            "1 AA B0",
            "9E9 PZ 00",
            "1 44 00",
            "9999 ZZ 0G"
        };

        //then
        for (String value : values) {
            Assert.assertFalse(Pattern.matches(regex, value));
        }

    }

}
