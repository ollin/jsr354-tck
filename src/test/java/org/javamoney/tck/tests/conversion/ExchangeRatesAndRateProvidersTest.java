/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE
 * CONDITION THAT YOU ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT.
 * PLEASE READ THE TERMS AND CONDITIONS OF THIS AGREEMENT CAREFULLY. BY
 * DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF THE
 * AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE"
 * BUTTON AT THE BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency
 * API ("Specification") Copyright (c) 2012-2013, Credit Suisse All rights
 * reserved.
 */

package org.javamoney.tck.tests.conversion;

import org.jboss.test.audit.annotations.SpecAssertion;
import org.jboss.test.audit.annotations.SpecVersion;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for Exchange Rates and Rate Providers.
 * Created by Anatole on 10.03.14.
 */
@SpecVersion(spec = "JSR 354", version = "1.0.0")
public class ExchangeRatesAndRateProvidersTest{

    // *************************** A. Test Basic MonetaryConversions Accessors *********************************

    /**
     * Test access to conversion rates.<br/>
     * Hint: this assertion will require multiple tests to be written!
     */
    @Test @SpecAssertion(id="433-A1", section="4.3.3")
    public void testAccessRates(){
        Assert.fail();
    }

    /**
     * Ensure additional ConversionContext is passed correctly to SPIs.<br/>
     * Hint: this assertion will require some custom SPIs to be registered and selected for chain inclusion!
     */
    @Test @SpecAssertion(id="433-A2", section="4.3.3")
    public void testPassingOverConversionContextToSPIs(){
        Assert.fail();
    }

    /**
     * Bad case: try accessing rates with incosistent/invalid data.<br/>
     * Hint: this assertion will require multiple tests to be written!
     */
    @Test @SpecAssertion(id="433-A3", section="4.3.3")
    public void testInvalidUsage(){
        Assert.fail();
    }

}