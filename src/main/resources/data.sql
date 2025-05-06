INSERT INTO public.authors (firstname, middlename, lastname, dateofbirth, nationality, dateofdeath, bio, website, email, awards, activeyears, profilepictureurl)
VALUES
    ('Joanne', 'Rowling', 'Rowling', '1965-07-31', 'British', NULL, 'J.K. Rowling is a British author, best known for writing the Harry Potter fantasy series.', 'https://www.jkrowling.com', 'contact@jkrowling.com', 'Hugo Award, Nestlé Smarties Book Prize, British Book Awards, and more.', '1997–present', 'https://example.com/jk-rowling.jpg'),
    ('John', 'Ronald Reuel', 'Tolkien', '1892-01-03', 'British', '1973-09-02', 'J.R.R. Tolkien was an English writer, best known for his high-fantasy works "The Hobbit" and "The Lord of the Rings".', 'https://www.tolkien.co.uk', 'contact@tolkien.co.uk', 'International Fantasy Award, Mythopoeic Award', '1915–1973', 'https://example.com/jrr-tolkien.jpg'),
    ('Eric', 'Arthur Blair', 'Orwell', '1903-06-25', 'British', '1950-01-21', 'George Orwell was an English novelist, essayist, journalist, and critic, best known for "1984" and "Animal Farm".', 'https://www.georgeorwell.org', 'contact@georgeorwell.org', 'Retro-Hugo Award, Prometheus Hall of Fame Award', '1928–1950', 'https://example.com/george-orwell.jpg'),
    ('Agatha', NULL, 'Christie', '1890-09-15', 'British', '1976-01-12', 'Agatha Christie was an English writer known for her 66 detective novels and 14 short story collections.', 'https://www.agathachristie.com', 'contact@agathachristie.com', 'Edgar Award, Anthony Award', '1920–1976', 'https://example.com/agatha-christie.jpg'),


    ('George', 'Orwell', 'Smith', '1903-06-25', 'British', '1950-01-21', 'English novelist, essayist, and critic.', 'https://georgeorwell.com', 'george.orwell@mail.com', 'Prometheus Hall of Fame Award', '1928-1949', 'https://example.com/orwell.jpg'),
    ('Jane', 'Austen', 'Catherine', '1775-12-16', 'British', '1817-07-18', 'English novelist known for her six major novels.', 'https://janeausten.org', 'jane.austen@mail.com', 'Great Writers of the English Novel', '1795-1817', 'https://example.com/austen.jpg'),
    ('Mark', 'Twain', 'Langhorne', '1835-11-30', 'American', '1910-04-21', 'American writer and humorist, famous for "The Adventures of Tom Sawyer".', 'https://marktwain.org', 'mark.twain@mail.com', 'The Mark Twain Prize for American Humor', '1865-1910', 'https://example.com/twain.jpg'),
    ('J.K.', 'Rowling', 'Kathleen', '1965-07-31', 'British', NULL, 'British author and philanthropist, famous for the Harry Potter series.', 'https://jkrowling.com', 'jk.rowling@mail.com', 'British Book Awards, Hugo Award', '1997-present', 'https://example.com/rowling.jpg'),
    ('F.', 'Scott', 'Fitzgerald', '1896-09-24', 'American', '1940-12-21', 'American novelist, known for "The Great Gatsby".', 'https://fscottfitzgerald.com', 'scott.fitzgerald@mail.com', 'Pulitzer Prize Nominee', '1920-1940', 'https://example.com/fitzgerald.jpg'),
    ('Ernest', 'Miller', 'Hemingway', '1899-07-21', 'American', '1961-07-02', 'American novelist and short-story writer.', 'https://ernesthemingway.com', 'ernest.hemingway@mail.com', 'Nobel Prize in Literature', '1920-1961', 'https://example.com/hemingway.jpg'),
    ('Leo', 'Nikolaevich', 'Tolstoy', '1828-09-09', 'Russian', '1910-11-20', 'Russian novelist, known for "War and Peace" and "Anna Karenina".', 'https://tolstoy.com', 'leo.tolstoy@mail.com', 'Nobel Prize Nominee', '1852-1910', 'https://example.com/tolstoy.jpg'),
    ('Virginia', 'Adeline', 'Woolf', '1882-01-25', 'British', '1941-03-28', 'English writer and one of the most prominent modernist authors.', 'https://virginiawoolf.com', 'virginia.woolf@mail.com', 'James Tait Black Memorial Prize', '1905-1941', 'https://example.com/woolf.jpg'),
    ('Gabriel', 'José', 'García Márquez', '1927-03-06', 'Colombian', '2014-04-17', 'Colombian novelist, short-story writer, screenwriter, and journalist.', 'https://gabrielgarciamarquez.com', 'gabriel.marquez@mail.com', 'Nobel Prize in Literature', '1947-2014', 'https://example.com/marquez.jpg'),
    ('Herman', 'Melville', NULL, '1819-08-01', 'American', '1891-09-28', 'American novelist, short story writer, and poet.', 'https://hermanmelville.com', 'herman.melville@mail.com', 'International Literary Hall of Fame', '1846-1891', 'https://example.com/melville.jpg'),
    ('J.R.R.', 'Ronald', 'Tolkien', '1892-01-03', 'British', '1973-09-02', 'English writer, poet, and philologist, best known for "The Lord of the Rings".', 'https://jrrtolkien.com', 'tolkien@mail.com', 'International Fantasy Award', '1937-1973', 'https://example.com/tolkien.jpg'),
    ('Haruki', NULL, 'Murakami', '1949-01-12', 'Japanese', NULL, 'Japanese writer and translator, known for his surrealist fiction.', 'https://harukimurakami.com', 'haruki.murakami@mail.com', 'World Fantasy Award', '1979-present', 'https://example.com/murakami.jpg'),
    ('Agatha', 'Mary', 'Christie', '1890-09-15', 'British', '1976-01-12', 'English writer known for her 66 detective novels and 14 short story collections.', 'https://agathachristie.com', 'agatha.christie@mail.com', 'Edgar Award for Best Play', '1920-1976', 'https://example.com/christie.jpg'),
    ('Chinua', NULL, 'Achebe', '1930-11-16', 'Nigerian', '2013-03-21', 'Nigerian novelist and author of "Things Fall Apart".', 'https://chinuaachebe.com', 'chinua.achebe@mail.com', 'Man Booker International Prize', '1958-2013', 'https://example.com/achebe.jpg'),
    ('Margaret', 'Eleanor', 'Atwood', '1939-11-18', 'Canadian', NULL, 'Canadian poet, novelist, literary critic, and essayist.', 'https://margaretatwood.com', 'margaret.atwood@mail.com', 'Booker Prize, Arthur C. Clarke Award', '1969-present', 'https://example.com/atwood.jpg'),
    ('Toni', NULL, 'Morrison', '1931-02-18', 'American', '2019-08-05', 'American novelist and essayist, won the Nobel Prize in Literature.', 'https://tonimorrison.com', 'toni.morrison@mail.com', 'Pulitzer Prize, Nobel Prize', '1970-2019', 'https://example.com/morrison.jpg'),
    ('Kurt', 'Vonnegut', 'Jr.', '1922-11-11', 'American', '2007-04-11', 'American writer, known for his satirical and darkly humorous works.', 'https://kurtvonnegut.com', 'kurt.vonnegut@mail.com', 'Hugo Award, Locus Award', '1950-2007', 'https://example.com/vonnegut.jpg'),
    ('Franz', 'Xavier', 'Kafka', '1883-07-03', 'Austrian', '1924-06-03', 'Bohemian novelist and short story writer.', 'https://franzkafka.com', 'franz.kafka@mail.com', 'Max Brod Prize', '1908-1924', 'https://example.com/kafka.jpg'),
    ('Isaac', 'Asimov', NULL, '1920-01-02', 'American', '1992-04-06', 'American writer and professor of biochemistry, known for science fiction.', 'https://isaacasimov.com', 'isaac.asimov@mail.com', 'Hugo Award, Nebula Award', '1939-1992', 'https://example.com/asimov.jpg'),
    ('James', 'Augustine', 'Joyce', '1882-02-02', 'Irish', '1941-01-13', 'Irish novelist and poet.', 'https://jamesjoyce.com', 'james.joyce@mail.com', 'International Dublin Literary Award', '1914-1941', 'https://example.com/joyce.jpg'),
    ('Maya', 'Angelou', NULL, '1928-04-04', 'American', '2014-05-28', 'American memoirist, poet, and civil rights activist.', 'https://mayaangelou.com', 'maya.angelou@mail.com', 'Presidential Medal of Freedom', '1969-2014', 'https://example.com/angelou.jpg'),
    ('George', NULL, 'Eliot', '1819-11-22', 'British', '1880-12-22', 'English novelist, known for "Middlemarch".', 'https://georgeeliot.com', 'george.eliot@mail.com', 'British Academy Award', '1856-1880', 'https://example.com/eliot.jpg'),
    ('William', 'Shakespeare', NULL, '1564-04-23', 'British', '1616-04-23', 'English playwright, poet, and actor.', 'https://shakespeare.com', 'william.shakespeare@mail.com', 'World Literature Hall of Fame', '1589-1613', 'https://example.com/shakespeare.jpg'),
    ('Emily', 'Elizabeth', 'Dickinson', '1830-12-10', 'American', '1886-05-15', 'American poet, known for her reclusive lifestyle and numerous posthumous works.', 'https://emilydickinson.com', 'emily.dickinson@mail.com', 'Pulitzer Prize', '1858-1886', 'https://example.com/dickinson.jpg'),
    ('Oscar', 'Fingal', 'Wilde', '1854-10-16', 'Irish', '1900-11-30', 'Irish poet and playwright, known for "The Picture of Dorian Gray".', 'https://oscarwilde.com', 'oscar.wilde@mail.com', 'International Theater Hall of Fame', '1879-1900', 'https://example.com/wilde.jpg');


-- books
INSERT INTO public.books (isbn, title, publicationdate, genre, pagecount, language, coverimageurl, descriptionsummary, rating, copiesavailable, dateadded, status)
VALUES
    ('9780747532743', 'Harry Potter and the Philosophers Stone', '1997-06-26', 'Fantasy', 223, 'English', 'https://example.com/hp1.jpg', 'The first book in the Harry Potter series, where a young boy discovers he is a wizard.', 4.9, 10, '2024-12-01', 'Available'),
    ('9780747538493', 'Harry Potter and the Chamber of Secrets', '1998-07-02', 'Fantasy', 251, 'English', 'https://example.com/hp2.jpg', 'The second book in the Harry Potter series, where Harry faces a deadly creature in a hidden chamber.', 4.8, 12, '2024-12-01', 'Available'),
    ('9780747542155', 'Harry Potter and the Prisoner of Azkaban', '1999-07-08', 'Fantasy', 317, 'English', 'https://example.com/hp3.jpg', 'Harry Potter learns about his family history while uncovering the truth about a prisoner escaping Azkaban.', 4.9, 15, '2024-12-01', 'Available'),
    ('9780747546245', 'Harry Potter and the Goblet of Fire', '2000-07-08', 'Fantasy', 636, 'English', 'https://example.com/hp4.jpg', 'The fourth book in the series, where Harry competes in the dangerous Triwizard Tournament.', 4.9, 20, '2024-12-01', 'Available'),
    ('9780747581086', 'Harry Potter and the Half-Blood Prince', '2005-07-16', 'Fantasy', 652, 'English', 'https://example.com/hp5.jpg', 'Harry unravels the mystery of Lord Voldemorts past and faces heartbreaking loss.', 4.9, 8, '2024-12-01', 'Available'),

    ('9780618640157', 'The Hobbit', '1937-09-21', 'Fantasy', 310, 'English', 'https://example.com/hobbit.jpg', 'The tale of Bilbo Baggins journey to reclaim a stolen treasure from a dragon.', 4.8, 10, '2024-12-01', 'Available'),
    ('9780261103573', 'The Fellowship of the Ring', '1954-07-29', 'Fantasy', 423, 'English', 'https://example.com/fellowship.jpg', 'The first part of "The Lord of the Rings" trilogy, where a fellowship is formed to destroy the One Ring.', 4.9, 15, '2024-12-01', 'Available'),
    ('9780261103580', 'The Two Towers', '1954-11-11', 'Fantasy', 352, 'English', 'https://example.com/twotowers.jpg', 'The second book in "The Lord of the Rings", where the fellowship splits and new alliances are formed.', 4.9, 13, '2024-12-01', 'Available'),
    ('9780261103597', 'The Return of the King', '1955-10-20', 'Fantasy', 416, 'English', 'https://example.com/returnoftheking.jpg', 'The final part of "The Lord of the Rings", where the battle for Middle-earth concludes with the destruction of the One Ring.', 4.9, 18, '2024-12-01', 'Available'),
    ('9780618640157', 'The Silmarillion', '1977-09-15', 'Fantasy', 365, 'English', 'https://example.com/silmarillion.jpg', 'A collection of mythopoeic stories about the creation of Middle-earth and the history of the First Age.', 4.7, 9, '2024-12-01', 'Available'),

    ('9780451524935', '1984', '1949-06-08', 'Dystopian', 328, 'English', 'https://example.com/1984.jpg', 'A dystopian novel about a totalitarian regime that controls every aspect of life, even thought.', 4.8, 7, '2024-12-01', 'Available'),
    ('9780452284234', 'Animal Farm', '1945-08-17', 'Allegory', 112, 'English', 'https://example.com/animalfarm.jpg', 'A political allegory that satirizes the Russian Revolution and the rise of totalitarianism.', 4.7, 5, '2024-12-01', 'Available'),
    ('9780451526342', 'Homage to Catalonia', '1938-04-01', 'Memoir', 224, 'English', 'https://example.com/homage.jpg', 'George Orwells personal account of his time fighting in the Spanish Civil War.', 4.5, 8, '2024-12-01', 'Available'),
    ('9780141187396', 'Down and Out in Paris and London', '1933-01-01', 'Memoir', 128, 'English', 'https://example.com/downandout.jpg', 'A memoir of Orwells experiences living in poverty in two major European cities.', 4.6, 6, '2024-12-01', 'Available'),
    ('9780452284234', 'Burmese Days', '1934-06-01', 'Novel', 352, 'English', 'https://example.com/burmese.jpg', 'A semi-autobiographical novel about the British colonial rule in Burma.', 4.4, 7, '2024-12-01', 'Available'),

    ('9780062073488', 'Murder on the Orient Express', '1934-01-01', 'Mystery', 256, 'English', 'https://example.com/murderorientexpress.jpg', 'A classic murder mystery in which detective Hercule Poirot solves a complex case aboard the Orient Express.', 4.7, 10, '2024-12-01', 'Available'),
    ('9780062081261', 'The Murder of Roger Ackroyd', '1926-06-01', 'Mystery', 288, 'English', 'https://example.com/murderrogerackroyd.jpg', 'A groundbreaking detective novel that features an unexpected twist ending, shocking readers upon its release.', 4.8, 8, '2024-12-01', 'Available'),
    ('9780062452467', 'And Then There Were None', '1939-11-06', 'Mystery', 272, 'English', 'https://example.com/andthen.jpg', 'Ten strangers are invited to an island where they are systematically killed by an unknown assailant.', 4.9, 12, '2024-12-01', 'Available'),
    ('9780062312372', 'Death on the Nile', '1937-02-01', 'Mystery', 320, 'English', 'https://example.com/deathonnile.jpg', 'A Hercule Poirot mystery, set aboard a luxurious steamer on the Nile River, where a murder is committed.', 4.7, 9, '2024-12-01', 'Available'),
    ('9780062073488', 'The ABC Murders', '1936-01-01', 'Mystery', 320, 'English', 'https://example.com/abcmurders.jpg', 'A series of murders follows an alphabetical pattern, and Hercule Poirot must uncover the killer’s identity.', 4.7, 11, '2024-12-01', 'Available'),



    ('978-0-123456-47-2', 'The Alchemist', '1988-04-01', 'Adventure', 208, 'English', 'https://example.com/alchemist.jpg', 'A story about following your dreams.', 1, 3, '2023-01-15', 'Available'),
    ('978-1-234567-89-7', 'To Kill a Mockingbird', '1960-07-11', 'Fiction', 281, 'English', 'https://example.com/mockingbird.jpg', 'A novel about racial injustice in the Deep South.', 4.8, 2, '2023-01-18', 'Available'),
    ('978-2-345678-90-8', '1984', '1949-06-08', 'Dystopian', 328, 'English', 'https://example.com/1984.jpg', 'A dystopian novel set in a totalitarian regime.', 4.6, 5, '2023-02-10', 'Available'),
    ('978-3-456789-01-9', 'The Great Gatsby', '1925-04-10', 'Classic', 180, 'English', 'https://example.com/gatsby.jpg', 'A story about the American dream in the 1920s.', 4.4, 4, '2023-02-12', 'Available'),
    ('978-4-567890-12-0', 'Pride and Prejudice', '1813-01-28', 'Romance', 432, 'English', 'https://example.com/pride.jpg', 'A romantic novel about class and social issues.', 4.5, 6, '2023-02-20', 'Available'),
    ('978-5-678901-23-1', 'Moby Dick', '1851-10-18', 'Adventure', 585, 'English', 'https://example.com/mobydick.jpg', 'The quest for revenge against a giant whale.', 4.2, 2, '2023-03-01', 'Available'),
    ('978-6-789012-34-2', 'War and Peace', '1869-01-01', 'Historical', 1225, 'English', 'https://example.com/warandpeace.jpg', 'A narrative of Russian society during the Napoleonic Wars.', 4.3, 1, '2023-03-10', 'Available'),
    ('978-7-890123-45-3', 'The Catcher in the Rye', '1951-07-16', 'Fiction', 277, 'English', 'https://example.com/catcher.jpg', 'A story of teenage angst and alienation.', 4.0, 3, '2023-03-15', 'Available'),
    ('978-8-901234-56-4', 'The Hobbit', '1937-09-21', 'Fantasy', 310, 'English', 'https://example.com/hobbit.jpg', 'A fantasy adventure that precedes the Lord of the Rings.', 4.6, 4, '2023-03-22', 'Available'),
    ('978-9-012345-67-5', 'Fahrenheit 451', '1953-10-19', 'Dystopian', 158, 'English', 'https://example.com/fahrenheit.jpg', 'A story about a future where books are banned.', 4.5, 5, '2023-04-01', 'Available'),
    ('978-0-123456-78-9', 'Brave New World', '1932-01-01', 'Dystopian', 268, 'English', 'https://example.com/brave.jpg', 'A novel about a technologically advanced future.', 4.4, 6, '2023-04-10', 'Available'),
    ('978-1-234567-01-0', 'The Picture of Dorian Gray', '1890-07-01', 'Classic', 224, 'English', 'https://example.com/doriangray.jpg', 'A novel about vanity and moral corruption.', 4.1, 2, '2023-04-15', 'Available'),
    ('978-2-345678-12-1', 'Jane Eyre', '1847-10-16', 'Classic', 508, 'English', 'https://example.com/janeeyre.jpg', 'A strong-willed orphan who overcomes adversity.', 4.3, 3, '2023-04-20', 'Available'),
    ('978-3-456789-23-2', 'The Chronicles of Narnia', '1950-10-16', 'Fantasy', 768, 'English', 'https://example.com/narnia.jpg', 'A series of seven fantasy novels.', 4.7, 4, '2023-04-25', 'Available'),
    ('978-4-567890-34-3', 'The Fault in Our Stars', '2012-01-10', 'Romance', 313, 'English', 'https://example.com/fault.jpg', 'A love story between two cancer patients.', 4.5, 5, '2023-05-01', 'Available'),
    ('978-5-678901-45-4', 'The Hunger Games', '2008-09-14', 'Dystopian', 374, 'English', 'https://example.com/hunger.jpg', 'A fight to the death in a dystopian society.', 4.3, 2, '2023-05-10', 'Available'),
    ('978-6-789012-56-5', 'The Da Vinci Code', '2003-03-18', 'Thriller', 454, 'English', 'https://example.com/davinci.jpg', 'A mystery thriller about a murder in the Louvre.', 4.4, 3, '2023-05-15', 'Available'),
    ('978-7-890123-67-6', 'The Girl with the Dragon Tattoo', '2005-08-24', 'Thriller', 465, 'English', 'https://example.com/dragon.jpg', 'A gripping mystery that uncovers dark secrets.', 4.2, 4, '2023-05-20', 'Available'),
    ('978-8-901234-78-7', 'The Road', '2006-09-26', 'Dystopian', 287, 'English', 'https://example.com/road.jpg', 'A post-apocalyptic journey of survival.', 4.5, 1, '2023-05-25', 'Available'),
    ('978-9-012345-89-8', 'The Secret Garden', '1911-08-01', 'Children', 331, 'English', 'https://example.com/garden.jpg', 'A children’s novel about a hidden garden.', 4.4, 3, '2023-06-01', 'Available'),
    ('978-0-098765-43-2', 'The Kite Runner', '2003-05-29', 'Fiction', 371, 'English', 'https://example.com/kite.jpg', 'A story of friendship and redemption.', 4.7, 5, '2023-06-10', 'Available'),
    ('978-1-234567-10-3', 'Life of Pi', '2001-09-11', 'Adventure', 319, 'English', 'https://example.com/pi.jpg', 'A boy stranded on a lifeboat with a tiger.', 4.6, 2, '2023-06-15', 'Available'),
    ('978-2-345678-21-4', 'The Lovely Bones', '2002-01-01', 'Fiction', 328, 'English', 'https://example.com/lovely.jpg', 'A story about life after death from a victim’s perspective.', 4.5, 3, '2023-06-20', 'Available');


INSERT INTO public.author_book (author_id, book_id) VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (1, 4),
    (1, 5),
    (2, 6),
    (2, 7),
    (2, 8),
    (2, 9),
    (2, 10),
    (3, 11),
    (3, 12),
    (3, 13),
    (3, 14),
    (3, 15),
    (4, 16),
    (4, 17),
    (4, 18),
    (4, 19),
    (4, 20);
INSERT INTO public.userreviews (user_id, book_id, rating, reviewtext, reviewtitle, reviewdate, helpfulcount, flagged, flaggedreason, responsecount, updatedat, userrecommendation, readstatus, readdate, userlocation, spoilerflag, responsefromlibrarian, anonymousreview)
VALUES
    (1, 1, 4, 'Great book, highly recommend!', 'Fantastic Read', '2024-11-20', 3, FALSE, NULL, 0, '2024-11-20', TRUE, 'read', '2024-10-15', 'New York, USA', FALSE, NULL, FALSE),
    (2, 1, 5, 'Absolutely loved it.', 'Amazing!', '2024-11-19', 5, FALSE, NULL, 1, '2024-11-19', TRUE, 'read', '2024-09-10', 'Los Angeles, USA', FALSE, NULL, FALSE),
    (3, 1, 3, 'It was okay, not my favorite.', 'Average Story', '2024-11-18', 1, FALSE, NULL, 0, '2024-11-18', FALSE, 'read', '2024-09-20', 'Chicago, USA', FALSE, NULL, TRUE),
    (4, 1, 2, 'I found it hard to finish.', 'Not My Taste', '2024-11-17', 0, FALSE, NULL, 0, '2024-11-17', FALSE, 'read', '2024-08-25', 'Dallas, USA', FALSE, NULL, FALSE),
    (5, 1, 5, 'A masterpiece!', 'Loved Every Page', '2024-11-16', 10, FALSE, NULL, 2, '2024-11-16', TRUE, 'read', '2024-10-05', 'Seattle, USA', FALSE, NULL, FALSE),
    (6, 1, 4, 'Well-written and engaging.', 'Great Writing', '2024-11-15', 7, FALSE, NULL, 0, '2024-11-15', TRUE, 'read', '2024-09-25', 'Miami, USA', FALSE, NULL, FALSE),
    (7, 1, 1, 'Not what I expected.', 'Disappointing', '2024-11-14', 0, TRUE, 'Inappropriate Content', 0, '2024-11-14', FALSE, 'read', '2024-08-15', 'Austin, USA', FALSE, NULL, TRUE),
    (8, 1, 3, 'Interesting concept but slow.', 'Mixed Feelings', '2024-11-13', 2, FALSE, NULL, 0, '2024-11-13', TRUE, 'reading', NULL, 'Boston, USA', FALSE, NULL, FALSE),
    (9, 1, 5, 'My new favorite book!', 'Exceptional', '2024-11-12', 15, FALSE, NULL, 3, '2024-11-12', TRUE, 'read', '2024-09-30', 'San Francisco, USA', FALSE, 'Great insights from the author.', FALSE),
    (10, 1, 4, 'Solid and enjoyable.', 'Good Read', '2024-11-11', 4, FALSE, NULL, 1, '2024-11-11', TRUE, 'read', '2024-09-18', 'Denver, USA', FALSE, NULL, FALSE),
--
    (1, 2, 3, 'A bit underwhelming.', 'Not Bad', '2024-11-10', 2, FALSE, NULL, 0, '2024-11-10', FALSE, 'read', '2024-09-05', 'Phoenix, USA', FALSE, NULL, FALSE),
    (2, 2, 5, 'Couldn’t put it down!', 'Brilliant!', '2024-11-09', 8, FALSE, NULL, 1, '2024-11-09', TRUE, 'read', '2024-10-01', 'New Orleans, USA', FALSE, NULL, FALSE),
    (3, 2, 4, 'Very compelling story.', 'Gripping Tale', '2024-11-08', 6, FALSE, NULL, 0, '2024-11-08', TRUE, 'read', '2024-09-15', 'Atlanta, USA', FALSE, NULL, FALSE),
--     (4, 2, 2, 'Not for me, unfortunately.', 'Disappointing', '2024-11-07', 1, FALSE, NULL, 0, '2024-11-07', FALSE, 'read', '2024-08-20', 'Portland, USA', FALSE, NULL, TRUE),
--     (5, 2, 5, 'An unforgettable journey!', 'A Must-Read', '2024-11-06', 12, FALSE, NULL, 2, '2024-11-06', TRUE, 'read', '2024-10-10', 'Orlando, USA', FALSE, NULL, FALSE),
--     (6, 2, 3, 'Had some good moments.', 'Mixed Feelings', '2024-11-05', 3, FALSE, NULL, 0, '2024-11-05', TRUE, 'reading', NULL, 'Philadelphia, USA', FALSE, NULL, FALSE),
--     (7, 2, 1, 'I couldn’t finish it.', 'Dull and Slow', '2024-11-04', 0, TRUE, 'Inappropriate Content', 0, '2024-11-04', FALSE, 'dropped', NULL, 'Houston, USA', FALSE, NULL, TRUE),
--     (8, 2, 5, 'Kept me hooked till the end.', 'Engaging Read', '2024-11-03', 14, FALSE, NULL, 2, '2024-11-03', TRUE, 'read', '2024-10-05', 'San Diego, USA', FALSE, 'Loved the twists!', FALSE),
--     (9, 2, 4, 'Nice but could be better.', 'Good Enough', '2024-11-02', 5, FALSE, NULL, 1, '2024-11-02', TRUE, 'read', '2024-09-28', 'Indianapolis, USA', FALSE, NULL, FALSE),
--     (10, 2, 4, 'Really enjoyed it.', 'Worth It', '2024-11-01', 7, FALSE, NULL, 0, '2024-11-01', TRUE, 'read', '2024-09-20', 'Charlotte, USA', FALSE, NULL, FALSE),
--
    (1, 3, 3, 'A bit underwhelming.', 'Not Bad', '2024-11-10', 2, FALSE, NULL, 0, '2024-11-10', FALSE, 'read', '2024-09-05', 'Phoenix, USA', FALSE, NULL, FALSE),
    (2, 3, 5, 'Couldn’t put it down!', 'Brilliant!', '2024-11-09', 8, FALSE, NULL, 1, '2024-11-09', TRUE, 'read', '2024-10-01', 'New Orleans, USA', FALSE, NULL, FALSE),
    (3, 3, 4, 'Very compelling story.', 'Gripping Tale', '2024-11-08', 6, FALSE, NULL, 0, '2024-11-08', TRUE, 'read', '2024-09-15', 'Atlanta, USA', FALSE, NULL, FALSE),
--     (4, 3, 2, 'Not for me, unfortunately.', 'Disappointing', '2024-11-07', 1, FALSE, NULL, 0, '2024-11-07', FALSE, 'read', '2024-08-20', 'Portland, USA', FALSE, NULL, TRUE),
--     (5, 3, 5, 'An unforgettable journey!', 'A Must-Read', '2024-11-06', 12, FALSE, NULL, 2, '2024-11-06', TRUE, 'read', '2024-10-10', 'Orlando, USA', FALSE, NULL, FALSE),
--     (6, 3, 3, 'Had some good moments.', 'Mixed Feelings', '2024-11-05', 3, FALSE, NULL, 0, '2024-11-05', TRUE, 'reading', NULL, 'Philadelphia, USA', FALSE, NULL, FALSE),
--     (7, 3, 1, 'I couldn’t finish it.', 'Dull and Slow', '2024-11-04', 0, TRUE, 'Inappropriate Content', 0, '2024-11-04', FALSE, 'dropped', NULL, 'Houston, USA', FALSE, NULL, TRUE),
--     (8, 3, 5, 'Kept me hooked till the end.', 'Engaging Read', '2024-11-03', 14, FALSE, NULL, 2, '2024-11-03', TRUE, 'read', '2024-10-05', 'San Diego, USA', FALSE, 'Loved the twists!', FALSE),
--     (9, 3, 4, 'Nice but could be better.', 'Good Enough', '2024-11-02', 5, FALSE, NULL, 1, '2024-11-02', TRUE, 'read', '2024-09-28', 'Indianapolis, USA', FALSE, NULL, FALSE),
--     (10, 3, 4, 'Really enjoyed it.', 'Worth It', '2024-11-01', 7, FALSE, NULL, 0, '2024-11-01', TRUE, 'read', '2024-09-20', 'Charlotte, USA', FALSE, NULL, FALSE),
-- -- new test
--     (1, 1, 5, 'An eye-opening look into a dystopian future.', 'A Must-Read', '2023-11-15', 12, FALSE, NULL, 2, '2023-11-15', TRUE, 'Finished', '2023-10-30', 'New York, USA', FALSE, NULL, FALSE),
--     (2, 1, 4, 'Chilling and thought-provoking, but a bit slow at times.', 'Dark and Powerful', '2023-11-10', 8, FALSE, NULL, 1, '2023-11-10', TRUE, 'Currently Reading', NULL, 'London, UK', FALSE, NULL, FALSE),
--     (3, 1, 5, 'A masterpiece that remains relevant even today.', 'Timeless Classic', '2023-11-08', 15, FALSE, NULL, 3, '2023-11-08', TRUE, 'Finished', '2023-10-20', 'Toronto, Canada', FALSE, NULL, FALSE),
--     (4, 1, 4, 'The themes are incredibly impactful, but the pacing was uneven.', 'Profound Themes', '2023-11-01', 5, FALSE, NULL, 0, '2023-11-01', TRUE, 'Finished', '2023-09-30', 'Sydney, Australia', FALSE, NULL, FALSE),
--     (5, 1, 3, 'Not my cup of tea, but I can appreciate its importance.', 'Overrated but Important', '2023-10-25', 2, FALSE, NULL, 0, '2023-10-25', FALSE, 'Abandoned', NULL, 'Berlin, Germany', FALSE, NULL, FALSE),
--     (6, 1, 5, 'Terrifying and unforgettable. It will stay with you.', 'Unforgettable', '2023-10-15', 10, FALSE, NULL, 1, '2023-10-15', TRUE, 'Finished', '2023-09-01', 'Paris, France', FALSE, NULL, FALSE),
--     (7, 1, 4, 'George Orwell was ahead of his time. A true visionary.', 'Ahead of its Time', '2023-10-10', 7, FALSE, NULL, 0, '2023-10-10', TRUE, 'Finished', '2023-08-15', 'Tokyo, Japan', FALSE, NULL, FALSE),
--     (8, 1, 3, 'I found it hard to connect with the characters, but the message is strong.', 'Message Over Story', '2023-09-30', 3, FALSE, NULL, 0, '2023-09-30', FALSE, 'Currently Reading', NULL, 'Los Angeles, USA', FALSE, NULL, FALSE),
--     (9, 1, 5, 'Orwell’s warnings feel eerily real in today’s world.', 'Still Relevant', '2023-09-15', 20, FALSE, NULL, 2, '2023-09-15', TRUE, 'Finished', '2023-08-01', 'Mumbai, India', FALSE, NULL, FALSE),
--     (10, 1, 4, 'A chilling narrative that keeps you thinking long after reading.', 'Thought-Provoking', '2023-08-20', 9, FALSE, NULL, 1, '2023-08-20', TRUE, 'Finished', '2023-07-15', 'Cape Town, South Africa', FALSE, NULL, FALSE),
-- -- anonymous users
    (NULL, 1, 4, 'A haunting look at surveillance and control.', 'Chilling and Relevant', '2023-10-05', 6, FALSE, NULL, 0, '2023-10-05', TRUE, 'Finished', '2023-09-10', NULL, FALSE, NULL, TRUE),
    (NULL, 1, 5, 'An essential read for anyone concerned about freedom.', 'Essential Reading', '2023-09-01', 18, FALSE, NULL, 1, '2023-09-01', TRUE, 'Finished', '2023-08-01', NULL, FALSE, NULL, TRUE);
-- --     old data
--
--     ('user1', 101, 5, 'Great book with insightful ideas.', 'Fantastic Read!', '2023-08-01', 12, false, false, 3, '2023-09-01', true, 'Finished', '2023-07-30', 'New York, USA', false, NULL, false),
--     ('user2', 102, 4, 'Very interesting plot but a bit slow in the middle.', 'Interesting Story', '2023-07-15', 5, false, NULL, 1, '2023-08-15', true, 'Reading', NULL, 'Los Angeles, USA', false, NULL, false),
--     ('user3', 103, 3, 'Not what I expected.', 'A Disappointment', '2023-06-05', 0, true, 'Offensive content', 0, '2023-06-20', false, 'Dropped', NULL, 'Chicago, USA', true, NULL, true),
--     ('user4', 104, 5, 'Amazing! Could not put it down!', 'Loved It!', '2023-09-20', 18, false, NULL, 2, '2023-10-01', true, 'Finished', '2023-09-19', 'Miami, USA', false, 'Thank you for the feedback!', false),
--     ('user5', 105, 2, 'Found it too repetitive.', 'Boring and Repetitive', '2023-08-22', 1, false, NULL, 0, '2023-09-05', false, 'Dropped', NULL, 'Seattle, USA', false, NULL, false),
--     ('user6', 1, 4, 'Enjoyed the writing style, but some parts were predictable.', 'Good but Predictable', '2023-05-11', 6, false, NULL, 4, '2023-06-01', true, 'Finished', '2023-05-10', 'San Francisco, USA', false, NULL, false),
--     ('user7', 3, 1, 'Worst book I have ever read.', 'Terrible Experience', '2023-04-02', 0, true, 'Contains hate speech', 0, '2023-04-10', false, 'Dropped', NULL, 'Austin, USA', true, NULL, true);
--     ('user8', 108, 5, 'A must-read for anyone interested in history.', 'Highly Recommend!', '2023-07-18', 24, false, NULL, 3, '2023-08-10', true, 'Finished', '2023-07-15', 'Boston, USA', false, NULL, false),
--     ('user9', 109, 3, 'Average. Could have been better.', 'An Okay Read', '2023-09-14', 2, false, NULL, 1, '2023-09-20', true, 'Reading', NULL, 'Phoenix, USA', false, NULL, true),
--     ('user10', 110, 4, 'The characters were well developed, but the plot was lacking.', 'Good Characters, Weak Plot', '2023-08-06', 7, false, NULL, 2, '2023-08-25', true, 'Finished', '2023-08-05', 'Denver, USA', false, NULL, false),
--     ('user11', 111, 2, 'Not really my style.', 'Not For Me', '2023-03-01', 1, false, NULL, 0, '2023-03-10', false, 'Dropped', NULL, 'Dallas, USA', false, NULL, false),
--     ('user12', 112, 5, 'This book changed my life.', 'Life-Changing', '2023-06-15', 30, false, NULL, 10, '2023-07-01', true, 'Finished', '2023-06-14', 'Houston, USA', false, 'We appreciate your review!', false),
--     ('user13', 113, 3, 'A decent read, but nothing special.', 'Just Average', '2023-05-22', 4, false, NULL, 2, '2023-06-05', true, 'Finished', '2023-05-20', 'Philadelphia, USA', false, NULL, false),
--     ('user14', 114, 4, 'A gripping thriller with great twists.', 'Thrilling!', '2023-09-03', 9, false, NULL, 3, '2023-09-10', true, 'Reading', NULL, 'Atlanta, USA', false, NULL, true),
--     ('user15', 115, 5, 'One of the best books I have ever read.', 'Masterpiece!', '2023-07-07', 28, false, NULL, 6, '2023-08-01', true, 'Finished', '2023-07-05', 'Portland, USA', false, NULL, false),
--     ('user16', 116, 1, 'Didn’t like it at all.', 'Not My Thing', '2023-04-18', 0, false, NULL, 0, '2023-05-01', false, 'Dropped', NULL, 'Las Vegas, USA', false, NULL, false),
--     ('user17', 117, 3, 'The plot was engaging but I didn’t connect with the characters.', 'Mixed Feelings', '2023-02-12', 3, false, NULL, 1, '2023-02-20', true, 'Finished', '2023-02-11', 'Detroit, USA', false, NULL, false),
--     ('user18', 118, 5, 'A beautiful story with deep meaning.', 'Highly Recommend', '2023-08-30', 15, false, NULL, 4, '2023-09-12', true, 'Finished', '2023-08-28', 'San Diego, USA', false, 'Thanks for the recommendation!', false),
--     ('user19', 119, 2, 'I struggled to finish this book.', 'Not Worth It', '2023-07-25', 0, false, NULL, 1, '2023-08-01', false, 'Finished', '2023-07-24', 'Columbus, USA', false, NULL, true),
--     ('user20', 120, 4, 'Very enjoyable, but not perfect.', 'Enjoyable Read', '2023-06-05', 10, false, NULL, 2, '2023-06-20', true, 'Finished', '2023-06-04', 'Baltimore, USA', false, NULL, false),
--     ('user21', 121, 3, 'Had high expectations, but it was just okay.', 'Overhyped', '2023-05-12', 5, false, NULL, 1, '2023-05-25', false, 'Finished', '2023-05-11', 'Indianapolis, USA', false, NULL, false),
--     ('user22', 122, 4, 'A solid book with great characters.', 'Well Written', '2023-04-25', 12, false, NULL, 3, '2023-05-10', true, 'Finished', '2023-04-23', 'Charlotte, USA', false, NULL, false),
--     ('user23', 123, 5, 'One of my all-time favorite books.', 'Must Read!', '2023-09-18', 35, false, NULL, 8, '2023-10-01', true, 'Finished', '2023-09-17', 'San Antonio, USA', false, NULL, false),
--     ('user24', 124, 1, 'I didn’t understand the point of this book.', 'Confusing', '2023-02-10', 0, true, 'Inappropriate language', 0, '2023-02-20', false, 'Dropped', NULL, 'Nashville, USA', true, NULL, true),
--     ('user25', 125, 4, 'An inspiring story with lots of heart.', 'Heartwarming', '2023-03-15', 14, false, NULL, 4, '2023-04-01', true, 'Finished', '2023-03-14', 'Kansas City, USA', false, NULL, false),
--     ('user26', 126, 3, 'A good read, but not memorable.', 'Good but Forgettable', '2023-06-25', 3, false, NULL, 1, '2023-07-01', true, 'Finished', '2023-06-24', 'Memphis, USA', false, NULL, false),
--     ('user27', 127, 5, 'An incredible journey with the characters.', 'Amazing!', '2023-07-03', 20, false, NULL, 5, '2023-07-20', true, 'Finished', '2023-07-02', 'Boston, USA', false, NULL, false),
--     ('user28', 128, 4, 'Well written, but a slow start.', 'Great Once It Picks Up', '2023-08-11', 6, false, NULL, 2, '2023-08-22', true, 'Finished', '2023-08-10', 'Miami, USA', false, NULL, false),
--     ('user29', 129, 2, 'Couldn’t finish it.', 'Abandoned Halfway', '2023-05-19', 0, false, NULL, 0, '2023-05-25', false, 'Dropped', NULL, 'New Orleans, USA', false, NULL, true),
--     ('user30', 130, 4, 'A moving and emotional story.', 'Very Touching', '2023-09-07', 17, false, NULL, 3, '2023-09-20', true, 'Finished', '2023-09-06', 'Las Vegas, USA', false, NULL, false);



-- inventories
INSERT INTO public.inventories (
    location, condition, acquisitionmethod, supplier, lastinventorycheck, borrowcount, borrowedstatus, reservestatus, replacementcost, edition, publisher, notes, barcode, isbn, restockdate, timeslost, circulationstatus, purchasedate)
VALUES
      ('Shelf A1', 'Good', 'Purchased', 'BookWorld', '2024-01-12', 5, 'Available', 'Not Reserved', 25.99, '1st Edition', 'Penguin Books', 'New arrival', '9781234567890', '978-0-12-345678-9', '2024-01-05', 0, 'In Circulation', '2024-01-01'),
      ('Shelf B2', 'Fair', 'Donated', 'Anonymous', '2023-11-10', 2, 'Borrowed', 'Reserved', 18.50, '2nd Edition', 'HarperCollins', 'Slight wear on cover', '9789876543210', '978-0-23-456789-0', '2023-12-20', 1, 'Out of Circulation', '2023-09-15'),
      ('Shelf C3', 'Good', 'Purchased', 'City Library', '2023-10-08', 7, 'Available', 'Not Reserved', 12.99, '3rd Edition', 'Oxford Press', 'Popular book in demand', '9782345678901', '978-0-34-567890-1', '2023-10-10', 0, 'In Circulation', '2023-05-10'),
      ('Shelf D4', 'New', 'Purchased', 'GlobalBooks', '2023-12-01', 3, 'Borrowed', 'Not Reserved', 35.50, '1st Edition', 'Scholastic', 'High-quality hardcover', '9783456789012', '978-0-45-678901-2', '2024-02-01', 0, 'In Circulation', '2024-01-15'),
      ('Shelf E5', 'Poor', 'Donated', 'Local Charity', '2023-08-30', 1, 'Borrowed', 'Reserved', 8.99, '5th Edition', 'Simon & Schuster', 'Damaged spine, to be repaired', '9784567890123', '978-0-56-789012-3', '2024-01-15', 2, 'Out of Circulation', '2023-02-28'),
      ('Shelf F6', 'Excellent', 'Purchased', 'BookShop Ltd.', '2024-03-15', 10, 'Available', 'Not Reserved', 45.99, '2nd Edition', 'Random House', 'Recently added bestseller', '9785678901234', '978-0-67-890123-4', '2024-04-10', 0, 'In Circulation', '2024-03-01'),
      ('Shelf G7', 'Good', 'Purchased', 'National Library', '2023-11-12', 6, 'Borrowed', 'Reserved', 29.75, '4th Edition', 'Knopf', 'Good condition, frequently borrowed', '9786789012345', '978-0-78-901234-5', '2024-05-05', 1, 'In Circulation', '2023-11-20'),
      ('Shelf H8', 'Fair', 'Purchased', 'BooksDirect', '2023-10-25', 8, 'Available', 'Not Reserved', 15.30, '3rd Edition', 'Macmillan', 'Some minor wear', '9787890123456', '978-0-89-012345-6', '2024-06-01', 0, 'In Circulation', '2024-01-30'),
      ('Shelf I9', 'Good', 'Purchased', 'City Library', '2023-09-19', 9, 'Borrowed', 'Reserved', 19.99, '5th Edition', 'Hachette', 'Popular with students', '9788901234567', '978-0-90-123456-7', '2024-02-15', 0, 'In Circulation', '2023-07-12'),
      ('Shelf J1', 'Good', 'Purchased', 'GlobalBooks', '2024-01-12', 12, 'Available', 'Not Reserved', 24.99, '1st Edition', 'HarperCollins', 'Well-received fiction', '9789012345678', '978-1-01-234567-8', '2024-03-01', 0, 'In Circulation', '2023-12-11'),
      ('Shelf A2', 'Excellent', 'Purchased', 'BookWorld', '2024-02-10', 7, 'Borrowed', 'Not Reserved', 22.50, '2nd Edition', 'Penguin Books', 'Lightly used', '9782345671234', '978-1-02-345678-9', '2024-03-15', 0, 'In Circulation', '2024-01-20'),
      ('Shelf B3', 'Good', 'Purchased', 'BooksDirect', '2023-11-01', 11, 'Available', 'Reserved', 33.00, '1st Edition', 'Simon & Schuster', 'Recently borrowed', '9783456782345', '978-1-03-456789-0', '2024-02-08', 0, 'In Circulation', '2023-10-21'),
      ('Shelf C4', 'Fair', 'Donated', 'Anonymous', '2023-07-05', 4, 'Available', 'Not Reserved', 12.75, '2nd Edition', 'Macmillan', 'Cover slightly damaged', '9784567893456', '978-1-04-567890-1', '2023-12-10', 1, 'Out of Circulation', '2023-04-30'),
      ('Shelf D5', 'Good', 'Purchased', 'National Library', '2023-09-25', 15, 'Borrowed', 'Reserved', 25.25, '3rd Edition', 'Oxford Press', 'Well-read', '9785678904567', '978-1-05-678901-2', '2024-04-05', 0, 'In Circulation', '2023-06-17'),
      ('Shelf E6', 'Poor', 'Donated', 'Local Charity', '2023-08-02', 3, 'Available', 'Not Reserved', 9.50, '1st Edition', 'Scholastic', 'Old but intact', '9786789015678', '978-1-06-789012-3', '2024-01-28', 2, 'Out of Circulation', '2023-03-11'),
      ('Shelf F7', 'Good', 'Purchased', 'GlobalBooks', '2023-10-19', 5, 'Borrowed', 'Not Reserved', 40.75, '2nd Edition', 'Random House', 'Great condition', '9787890126789', '978-1-07-890123-4', '2024-03-10', 0, 'In Circulation', '2024-01-09'),
      ('Shelf G8', 'Excellent', 'Purchased', 'BookShop Ltd.', '2024-02-02', 18, 'Available', 'Reserved', 60.00, '5th Edition', 'Knopf', 'Heavily in demand', '9788901237890', '978-1-08-901234-5', '2024-05-01', 0, 'In Circulation', '2024-02-20'),
      ('Shelf H9', 'Good', 'Purchased', 'City Library', '2023-09-18', 14, 'Available', 'Not Reserved', 16.20, '3rd Edition', 'Macmillan', 'Good condition', '9789012348901', '978-1-09-012345-6', '2024-03-01', 0, 'In Circulation', '2023-12-02'),
      ('Shelf I1', 'Fair', 'Donated', 'Local Charity', '2023-08-23', 1, 'Borrowed', 'Not Reserved', 7.80, '4th Edition', 'Hachette', 'Worn but readable', '9780123459012', '978-1-10-123456-7', '2023-11-10', 1, 'Out of Circulation', '2023-07-28'),
      ('Shelf J2', 'Good', 'Purchased', 'BooksDirect', '2024-01-15', 9, 'Available', 'Reserved', 20.99, '1st Edition', 'HarperCollins', 'Good as new', '9781234560123', '978-1-11-234567-8', '2024-04-12', 0, 'In Circulation', '2023-12-30');

insert into roles (active,description, role_name)
values
    (true,'administrator roles' , 'ROLE_ADMIN'),
    (true,'library staff' , 'ROLE_LIBRARY_STAFF'),
    (true,'user roles' , 'ROLE_USER');

insert into users (password, username,are_credentials_expired, is_enabled,is_expired,is_locked,bio,name )
values
    ('$2a$10$xRafNRZ2m.8S8P.S8.yuI.b/XNAfmfdH3Pm.0ibumpPDuJb/MGSLS','admin00_melisa', false,true,false,false,'developer','Jasper Aurelio Villas'),
    ('$2a$10$5ZgP25KbdBQNBQatzOciRulUDDHKh10MRzm5XkY0x8krSSbvW1DR.','staff01_janet', false,true,false,false,'librarian','Janet Willem'),
    ('$2a$10$4JbUQCwYDiv9rW0b8LQGNu0OHIUq2.TD0c.8HIuu644A7NUCGss9S','user00_mikael', false,true,false,false,'book lover','Mikael Ulrem');

insert into user_role (role_id, user_id)
values
    (1,1),
    (3,1),
    (2,2),
    (3,2),
    (3,3);


INSERT INTO public.addresses (id, street, houseno, postcode)
VALUES
    (1, 'Het Gooi', 2, '1527LH'),
--     (2, 'Oosten', 3, '1953NM'),
    (3, 'Woosten', 4, '1874HP');
