package sk.sepa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class UcitavanjeDatotekeController {
    @PostMapping("/sepaValidation")
    public String validateXml(@RequestBody String xmlData) {
        try {
            // Load the XSD schema
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(getClass().getResource("/sk/sepa/schema/pain.001.001.03.xsd"));

            // Create a validator
            Validator validator = schema.newValidator();

            // Perform validation
            validator.validate(new StreamSource(new java.io.StringReader(xmlData)));

            // Validation successful
            return "XML is valid according to the schema.";
        } catch (SAXException | IOException e) {
            // Validation failed
            return "XML validation failed: " + e.getMessage();
        }
    }
}
