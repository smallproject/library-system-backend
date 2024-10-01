package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.AuthorOutputDto;
import nl.smallproject.www.librarysystembackend.models.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {

    public AuthorOutputDto AuthorEntityToOutputDto(Author author) {
        AuthorOutputDto authorOutputDto = new AuthorOutputDto();
        authorOutputDto.setId(author.getId());
        authorOutputDto.setFirstName(author.getFirstName());
        authorOutputDto.setMiddleName(author.getMiddleName());
        authorOutputDto.setLastName(author.getLastName());
        authorOutputDto.setDateOfBirth(author.getDateOfBirth());
        authorOutputDto.setNationality(author.getNationality());
        authorOutputDto.setDateOfDeath(author.getDateOfDeath());
        authorOutputDto.setBio(author.getBio());
        authorOutputDto.setWebsite(author.getWebsite());
        authorOutputDto.setEmail(author.getEmail());
        authorOutputDto.setAwards(author.getAwards());
        authorOutputDto.setActiveYears(author.getActiveYears());
        authorOutputDto.setProfilePictureUrl(author.getProfilePictureUrl());
        return authorOutputDto;
    }
}
