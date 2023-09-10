package sk.sepa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile; // Import MultipartFile
import sk.sepa.object.nalog.Nalog;
import sk.sepa.schema.generated.Document;

@RestController
@RequestMapping("/api")
public class UcitavanjeDatotekeController {
    @PostMapping("/sepaValidation")
    public ResponseEntity<Object> validateXml(@RequestPart("file") MultipartFile file) {
        try {
            // Specify the file path to the XSD schema
            String xsdFilePath = "D:/code/spring/sepa_spring/src/main/java/sk/sepa/schema/pain.001.001.03.xsd";

            // Load the XSD schema from the file path
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File(xsdFilePath));

            // Create a validator
            Validator validator = schema.newValidator();

            // Perform validation on the uploaded XML file
            validator.validate(new StreamSource(file.getInputStream()));

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the uploaded XML file into a Document
            Document document = (Document) builder.parse(new InputSource(file.getInputStream()));






            // Validation successful
            return ResponseEntity.ok("XML is valid according to the schema."+ document);
        } catch (SAXException | IOException e) {
            // Validation failed
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("XML validation failed: " + e.getMessage());
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
