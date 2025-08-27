package mx.att.digital.customermanagement.infrastructure.configuration;

import mx.att.digital.customermanagement.interfaces.dto.IndividualStateType;
import mx.att.digital.customermanagement.interfaces.dto.OrganizationStateType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "mx.att.digital.customermanagement.infrastructure.configuration.EnumConverterConfiguration.individualStateTypeConverter")
    Converter<String, IndividualStateType> individualStateTypeConverter() {
        return new Converter<String, IndividualStateType>() {
            @Override
            public IndividualStateType convert(String source) {
                return IndividualStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "mx.att.digital.customermanagement.infrastructure.configuration.EnumConverterConfiguration.organizationStateTypeConverter")
    Converter<String, OrganizationStateType> organizationStateTypeConverter() {
        return new Converter<String, OrganizationStateType>() {
            @Override
            public OrganizationStateType convert(String source) {
                return OrganizationStateType.fromValue(source);
            }
        };
    }

}
