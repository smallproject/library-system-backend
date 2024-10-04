package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorInputDto;
import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorOutputDto;
import nl.smallproject.www.librarysystembackend.dtos.Author.AuthorUpdateDto;
import nl.smallproject.www.librarysystembackend.models.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {

    public AuthorOutputDto authorEntityToOutputDto(Author author) {
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

    public Author authorInputDtoToEntity(AuthorInputDto authorInputDto) {
        Author author = new Author();
        author.setFirstName(authorInputDto.getFirstName());
        author.setMiddleName(authorInputDto.getMiddleName());
        author.setLastName(authorInputDto.getLastName());
        author.setDateOfBirth(authorInputDto.getDateOfBirth());
        author.setNationality(authorInputDto.getNationality());
        author.setDateOfDeath(authorInputDto.getDateOfDeath());
        author.setBio(authorInputDto.getBio());
        author.setWebsite(authorInputDto.getWebsite());
        author.setEmail(authorInputDto.getEmail());
        author.setAwards(authorInputDto.getAwards());
        author.setActiveYears(authorInputDto.getActiveYears());
        author.setProfilePictureUrl(authorInputDto.getProfilePictureUrl());
        return author;
    }

    public Author authorUpdateDtoToEntity(AuthorUpdateDto authorUpdateDto) {
        Author author = new Author();
        author.setFirstName(authorUpdateDto.getFirstName());
        author.setMiddleName(authorUpdateDto.getMiddleName());
        author.setLastName(authorUpdateDto.getLastName());
        author.setDateOfBirth(authorUpdateDto.getDateOfBirth());
        author.setNationality(authorUpdateDto.getNationality());
        author.setDateOfDeath(authorUpdateDto.getDateOfDeath());
        author.setBio(authorUpdateDto.getBio());
        author.setWebsite(authorUpdateDto.getWebsite());
        author.setEmail(authorUpdateDto.getEmail());
        author.setAwards(authorUpdateDto.getAwards());
        author.setActiveYears(authorUpdateDto.getActiveYears());
        author.setProfilePictureUrl(authorUpdateDto.getProfilePictureUrl());
        return author;
    }
}
