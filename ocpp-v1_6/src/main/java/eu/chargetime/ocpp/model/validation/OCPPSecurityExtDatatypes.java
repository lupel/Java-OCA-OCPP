package eu.chargetime.ocpp.model.validation;
/*
   ChargeTime.eu - Java-OCA-OCPP

   MIT License

   Copyright (C) 2018 Thomas Volden <tv@chargetime.eu>
   Copyright (C) 2022 Mathias Oben <mathias.oben@enervalis.com>

   Permission is hereby granted, free of charge, to any person obtaining a copy
   of this software and associated documentation files (the "Software"), to deal
   in the Software without restriction, including without limitation the rights
   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
   copies of the Software, and to permit persons to whom the Software is
   furnished to do so, subject to the following conditions:

   The above copyright notice and this permission notice shall be included in all
   copies or substantial portions of the Software.

   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
   SOFTWARE.
*/

public class OCPPSecurityExtDatatypes {

  public static IValidationRule string50() {
    return new StringMaxLengthValidationRule(50);
  }

  public static IValidationRule string20() {
    return new StringMaxLengthValidationRule(20);
  }

  public static IValidationRule string40() {
    return new StringMaxLengthValidationRule(40);
  }

  public static IValidationRule string512() {
    return new StringMaxLengthValidationRule(512);
  }

  public static IValidationRule string1000() {
    return new StringMaxLengthValidationRule(1000);
  }

  public static IValidationRule identifierString() {
    return new IdentifierStringValidationRule();
  }
}
