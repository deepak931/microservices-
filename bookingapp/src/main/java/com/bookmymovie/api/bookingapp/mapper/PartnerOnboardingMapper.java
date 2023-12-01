package com.bookmymovie.api.bookingapp.mapper;

import com.bookmymovie.api.bookingapp.dto.PartnerDto;
import com.bookmymovie.api.bookingapp.entity.Partner;

public class PartnerOnboardingMapper {

  public static PartnerDto mapToPartnerOnboardingDto(Partner partnerOnboarding,
      PartnerDto partnerOnboardingDto) {
    partnerOnboardingDto.setName(partnerOnboarding.getName());
    partnerOnboardingDto.setEmail(partnerOnboarding.getEmail());
    partnerOnboardingDto.setClientId(partnerOnboardingDto.getClientId());
    partnerOnboardingDto.setMobileNumber(partnerOnboarding.getMobileNumber());
    partnerOnboardingDto.setCity(partnerOnboarding.getCity());
    partnerOnboardingDto.setAddress(partnerOnboarding.getAddress());
    return partnerOnboardingDto;
  }

  public static Partner mapToPartnerOnboarding(PartnerDto partnerOnboardingDto,
      Partner partnerOnboarding) {
    partnerOnboarding.setName(partnerOnboardingDto.getName());
    partnerOnboarding.setEmail(partnerOnboardingDto.getEmail());
    partnerOnboarding.setPartnerID(partnerOnboardingDto.getClientId());
    partnerOnboarding.setMobileNumber(partnerOnboardingDto.getMobileNumber());
    partnerOnboarding.setCity(partnerOnboardingDto.getCity());
    partnerOnboarding.setAddress(partnerOnboardingDto.getAddress());
    return partnerOnboarding;
  }
}
