-- authors
-- INSERT INTO public.authors (firstname, middlename, lastname, dateofbirth)
-- -- VALUES
-- -- ('Emily', 'Rose', 'Johnson', '1990-02-22'),
-- -- ('David', 'Alexander', 'Williams', '1982-11-03'),
-- -- ('Sarah', 'Elizabeth', 'Brown', '1995-05-19'),
-- -- ('James', 'Christopher', 'Jones', '1988-08-09'),
-- -- ('Linda', 'Marie', 'Garcia', '1983-07-12'),
-- -- ('Robert', 'Paul', 'Martinez', '1991-04-05'),
-- -- ('Karen', 'Ann', 'Rodriguez', '1980-12-14'),
-- -- ('Michael', 'Joseph', 'Hernandez', '1987-09-23'),
-- -- ( 'Patricia', 'Joy', 'Lopez', '1986-03-18'),
-- -- ( 'Charles', 'Edward', 'Gonzalez', '1992-10-07'),
-- -- ( 'Jessica', 'Nicole', 'Wilson', '1993-06-21'),
-- -- ( 'William', 'Thomas', 'Anderson', '1996-01-10'),
-- -- ( 'Elizabeth', 'Jane', 'Thomas', '1984-05-30'),
-- -- ( 'Christopher', 'John', 'Taylor', '1990-11-17'),
-- -- ( 'Barbara', 'Sue', 'Moore', '1981-03-05'),
-- -- ( 'Matthew', 'Ryan', 'Jackson', '1989-08-29'),
-- -- ( 'Deborah', 'Lynn', 'White', '1979-04-12'),
-- -- ( 'George', 'Steven', 'Harris', '1986-09-19'),
-- -- ( 'Sandra', 'Louise', 'Clark', '1991-06-03'),
-- -- ( 'Daniel', 'Scott', 'Lewis', '1992-01-11'),
-- -- ( 'Sharon', 'Elaine', 'Lee', '1984-02-23'),
-- -- ( 'Paul', 'David', 'Walker', '1988-11-01'),
-- -- ( 'Nancy', 'Renee', 'Hall', '1983-07-17'),
-- -- ( 'Donald', 'Wayne', 'Allen', '1987-04-30'),
-- -- ( 'Betty', 'Diane', 'Young', '1979-10-25'),
-- -- ( 'Mark', 'Andrew', 'King', '1993-09-09'),
-- -- ( 'Carol', 'Ellen', 'Wright', '1985-06-12'),
-- -- ( 'Joshua', 'Brian', 'Scott', '1995-12-19'),
-- -- ( 'Karen', 'Jean', 'Green', '1994-07-03'),
-- -- ( 'James', 'Eric', 'Baker', '1982-05-14'),
-- -- ( 'Lisa', 'Marie', 'Adams', '1997-01-30'),
-- -- ( 'Michael', 'Timothy', 'Nelson', '1981-02-18'),
-- -- ( 'Susan', 'Dawn', 'Mitchell', '1980-11-09'),
-- -- ( 'Joseph', 'Alan', 'Perez', '1989-09-26'),
-- -- ( 'Margaret', 'Irene', 'Roberts', '1986-08-21'),
-- -- ( 'Charles', 'Gregory', 'Turner', '1991-07-02'),
-- -- ( 'Dorothy', 'Michelle', 'Phillips', '1987-10-20'),
-- -- ( 'Brian', 'Douglas', 'Campbell', '1984-03-07'),
-- -- ( 'Maria', 'Teresa', 'Parker', '1995-04-01'),
-- -- ( 'Steven', 'Lee', 'Evans', '1983-06-28'),
-- -- ( 'Nancy', 'Christine', 'Edwards', '1979-12-15'),
-- -- ( 'Timothy', 'Wayne', 'Collins', '1992-09-30'),
-- -- ( 'Amy', 'Catherine', 'Stewart', '1982-01-04'),
-- -- ( 'Gary', 'Walter', 'Sanchez', '1990-03-23'),
-- -- ( 'Cynthia', 'Margaret', 'Morris', '1993-10-13');
--
-- -- inventories
-- INSERT INTO public.inventories (book, count, date, available)
-- VALUES
--
-- (101, 5, '2023-09-01', 'yes'),
-- (103, 7, '2023-09-03', 'yes'),
-- (104, 2, '2023-09-04', 'yes'),
-- (105, 8, '2023-09-05', 'no'),
-- (106, 9, '2023-09-06', 'yes'),
-- (107, 4, '2023-09-07', 'no'),
-- (108, 6, '2023-09-08', 'yes'),
-- (109, 3, '2023-09-09', 'yes'),
-- ( 110, 10, '2023-09-10', 'no'),
-- ( 111, 1, '2023-09-11', 'yes'),
-- ( 112, 0, '2023-09-12', 'no'),
-- ( 113, 5, '2023-09-13', 'yes'),
-- ( 114, 6, '2023-09-14', 'no'),
-- (102, 3, '2023-09-02', 'no'),
-- ( 115, 2, '2023-09-15', 'yes'),
-- ( 116, 7, '2023-09-16', 'yes'),
-- ( 117, 9, '2023-09-17', 'no'),
-- ( 118, 4, '2023-09-18', 'yes'),
-- ( 119, 6, '2023-09-19', 'no'),
-- ( 120, 8, '2023-09-20', 'yes'),
-- ( 121, 5, '2023-09-21', 'yes'),
-- ( 122, 3, '2023-09-22', 'no'),
-- ( 123, 7, '2023-09-23', 'yes'),
-- ( 124, 9, '2023-09-24', 'yes'),
-- ( 125, 2, '2023-09-25', 'no'),
-- ( 126, 8, '2023-09-26', 'yes'),
-- ( 127, 4, '2023-09-27', 'yes'),
-- ( 128, 1, '2023-09-28', 'no'),
-- ( 129, 3, '2023-09-29', 'yes'),
-- ( 130, 7, '2023-09-30', 'yes'),
-- ( 131, 5, '2023-10-01', 'no'),
-- ( 132, 9, '2023-10-02', 'yes'),
-- ( 133, 6, '2023-10-03', 'no'),
-- ( 134, 8, '2023-10-04', 'yes'),
-- ( 135, 3, '2023-10-05', 'yes'),
-- ( 136, 2, '2023-10-06', 'no'),
-- ( 137, 4, '2023-10-07', 'yes'),
-- ( 138, 7, '2023-10-08', 'yes'),
-- ( 139, 5, '2023-10-09', 'no'),
-- ( 140, 6, '2023-10-10', 'yes'),
-- ( 141, 1, '2023-10-11', 'yes'),
-- ( 142, 9, '2023-10-12', 'no'),
-- ( 143, 3, '2023-10-13', 'yes'),
-- ( 144, 4, '2023-10-14', 'yes'),
-- ( 145, 7, '2023-10-15', 'no'),
-- ( 146, 2, '2023-10-16', 'yes'),
-- ( 147, 8, '2023-10-17', 'yes'),
-- ( 148, 5, '2023-10-18', 'no'),
-- ( 149, 6, '2023-10-19', 'yes'),
-- ( 150, 9, '2023-10-20', 'yes');
INSERT INTO public.authors (firstname, middlename, lastname, dateofbirth, nationality, dateofdeath, bio, website, email, awards, activeyears, profilepictureurl)
VALUES
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
    ('978-0-123456-47-2', 'The Alchemist', '1988-04-01', 'Adventure', 208, 'English', 'https://example.com/alchemist.jpg', 'A story about following your dreams.', 4.7, 3, '2023-01-15', 'Available'),
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


-- userTemp review
INSERT INTO public.userreviews (userid, bookid, rating, reviewtext, reviewtitle, reviewdate, helpfulcount, flagged, flaggedreason, responsecount, updatedat, userrecommendation, readstatus, readdate, userlocation, spoilerflag, responsefromlibrarian, anonymousreview)
VALUES
    ('user1', 101, 5, 'Great book with insightful ideas.', 'Fantastic Read!', '2023-08-01', 12, false, false, 3, '2023-09-01', true, 'Finished', '2023-07-30', 'New York, USA', false, NULL, false),
    ('user2', 102, 4, 'Very interesting plot but a bit slow in the middle.', 'Interesting Story', '2023-07-15', 5, false, NULL, 1, '2023-08-15', true, 'Reading', NULL, 'Los Angeles, USA', false, NULL, false),
    ('user3', 103, 3, 'Not what I expected.', 'A Disappointment', '2023-06-05', 0, true, 'Offensive content', 0, '2023-06-20', false, 'Dropped', NULL, 'Chicago, USA', true, NULL, true),
    ('user4', 104, 5, 'Amazing! Could not put it down!', 'Loved It!', '2023-09-20', 18, false, NULL, 2, '2023-10-01', true, 'Finished', '2023-09-19', 'Miami, USA', false, 'Thank you for the feedback!', false),
    ('user5', 105, 2, 'Found it too repetitive.', 'Boring and Repetitive', '2023-08-22', 1, false, NULL, 0, '2023-09-05', false, 'Dropped', NULL, 'Seattle, USA', false, NULL, false),
    ('user6', 106, 4, 'Enjoyed the writing style, but some parts were predictable.', 'Good but Predictable', '2023-05-11', 6, false, NULL, 4, '2023-06-01', true, 'Finished', '2023-05-10', 'San Francisco, USA', false, NULL, false),
    ('user7', 107, 1, 'Worst book I have ever read.', 'Terrible Experience', '2023-04-02', 0, true, 'Contains hate speech', 0, '2023-04-10', false, 'Dropped', NULL, 'Austin, USA', true, NULL, true),
    ('user8', 108, 5, 'A must-read for anyone interested in history.', 'Highly Recommend!', '2023-07-18', 24, false, NULL, 3, '2023-08-10', true, 'Finished', '2023-07-15', 'Boston, USA', false, NULL, false),
    ('user9', 109, 3, 'Average. Could have been better.', 'An Okay Read', '2023-09-14', 2, false, NULL, 1, '2023-09-20', true, 'Reading', NULL, 'Phoenix, USA', false, NULL, true),
    ('user10', 110, 4, 'The characters were well developed, but the plot was lacking.', 'Good Characters, Weak Plot', '2023-08-06', 7, false, NULL, 2, '2023-08-25', true, 'Finished', '2023-08-05', 'Denver, USA', false, NULL, false),
    ('user11', 111, 2, 'Not really my style.', 'Not For Me', '2023-03-01', 1, false, NULL, 0, '2023-03-10', false, 'Dropped', NULL, 'Dallas, USA', false, NULL, false),
    ('user12', 112, 5, 'This book changed my life.', 'Life-Changing', '2023-06-15', 30, false, NULL, 10, '2023-07-01', true, 'Finished', '2023-06-14', 'Houston, USA', false, 'We appreciate your review!', false),
    ('user13', 113, 3, 'A decent read, but nothing special.', 'Just Average', '2023-05-22', 4, false, NULL, 2, '2023-06-05', true, 'Finished', '2023-05-20', 'Philadelphia, USA', false, NULL, false),
    ('user14', 114, 4, 'A gripping thriller with great twists.', 'Thrilling!', '2023-09-03', 9, false, NULL, 3, '2023-09-10', true, 'Reading', NULL, 'Atlanta, USA', false, NULL, true),
    ('user15', 115, 5, 'One of the best books I have ever read.', 'Masterpiece!', '2023-07-07', 28, false, NULL, 6, '2023-08-01', true, 'Finished', '2023-07-05', 'Portland, USA', false, NULL, false),
    ('user16', 116, 1, 'Didn’t like it at all.', 'Not My Thing', '2023-04-18', 0, false, NULL, 0, '2023-05-01', false, 'Dropped', NULL, 'Las Vegas, USA', false, NULL, false),
    ('user17', 117, 3, 'The plot was engaging but I didn’t connect with the characters.', 'Mixed Feelings', '2023-02-12', 3, false, NULL, 1, '2023-02-20', true, 'Finished', '2023-02-11', 'Detroit, USA', false, NULL, false),
    ('user18', 118, 5, 'A beautiful story with deep meaning.', 'Highly Recommend', '2023-08-30', 15, false, NULL, 4, '2023-09-12', true, 'Finished', '2023-08-28', 'San Diego, USA', false, 'Thanks for the recommendation!', false),
    ('user19', 119, 2, 'I struggled to finish this book.', 'Not Worth It', '2023-07-25', 0, false, NULL, 1, '2023-08-01', false, 'Finished', '2023-07-24', 'Columbus, USA', false, NULL, true),
    ('user20', 120, 4, 'Very enjoyable, but not perfect.', 'Enjoyable Read', '2023-06-05', 10, false, NULL, 2, '2023-06-20', true, 'Finished', '2023-06-04', 'Baltimore, USA', false, NULL, false),
    ('user21', 121, 3, 'Had high expectations, but it was just okay.', 'Overhyped', '2023-05-12', 5, false, NULL, 1, '2023-05-25', false, 'Finished', '2023-05-11', 'Indianapolis, USA', false, NULL, false),
    ('user22', 122, 4, 'A solid book with great characters.', 'Well Written', '2023-04-25', 12, false, NULL, 3, '2023-05-10', true, 'Finished', '2023-04-23', 'Charlotte, USA', false, NULL, false),
    ('user23', 123, 5, 'One of my all-time favorite books.', 'Must Read!', '2023-09-18', 35, false, NULL, 8, '2023-10-01', true, 'Finished', '2023-09-17', 'San Antonio, USA', false, NULL, false),
    ('user24', 124, 1, 'I didn’t understand the point of this book.', 'Confusing', '2023-02-10', 0, true, 'Inappropriate language', 0, '2023-02-20', false, 'Dropped', NULL, 'Nashville, USA', true, NULL, true),
    ('user25', 125, 4, 'An inspiring story with lots of heart.', 'Heartwarming', '2023-03-15', 14, false, NULL, 4, '2023-04-01', true, 'Finished', '2023-03-14', 'Kansas City, USA', false, NULL, false),
    ('user26', 126, 3, 'A good read, but not memorable.', 'Good but Forgettable', '2023-06-25', 3, false, NULL, 1, '2023-07-01', true, 'Finished', '2023-06-24', 'Memphis, USA', false, NULL, false),
    ('user27', 127, 5, 'An incredible journey with the characters.', 'Amazing!', '2023-07-03', 20, false, NULL, 5, '2023-07-20', true, 'Finished', '2023-07-02', 'Boston, USA', false, NULL, false),
    ('user28', 128, 4, 'Well written, but a slow start.', 'Great Once It Picks Up', '2023-08-11', 6, false, NULL, 2, '2023-08-22', true, 'Finished', '2023-08-10', 'Miami, USA', false, NULL, false),
    ('user29', 129, 2, 'Couldn’t finish it.', 'Abandoned Halfway', '2023-05-19', 0, false, NULL, 0, '2023-05-25', false, 'Dropped', NULL, 'New Orleans, USA', false, NULL, true),
    ('user30', 130, 4, 'A moving and emotional story.', 'Very Touching', '2023-09-07', 17, false, NULL, 3, '2023-09-20', true, 'Finished', '2023-09-06', 'Las Vegas, USA', false, NULL, false);



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

-- userTemps
-- INSERT INTO public.usersTemp (username, email, passwordhash, createdat, updatedat)
-- VALUES
-- ('john_doe', 'john@example.com', 'hashed_password', '2024-10-01', '2024-10-01'),
-- ('jane_smith', 'jane@example.com', 'hashed_password2', '2024-10-02', '2024-10-02'),
-- ('bob_jones', 'bob@example.com', 'hashed_password3', '2024-10-03', '2024-10-03'),
-- ('alice_walker', 'alice@example.com', 'hashed_password4', '2024-10-04', '2024-10-04'),
-- ('mike_brown', 'mike@example.com', 'hashed_password5', '2024-10-05', '2024-10-05'),
-- ('susan_clark', 'susan@example.com', 'hashed_password6', '2024-10-06', '2024-10-06'),
-- ('peter_parker', 'peter@example.com', 'hashed_password7', '2024-10-07', '2024-10-07'),
-- ('tony_stark', 'tony@example.com', 'hashed_password8', '2024-10-08', '2024-10-08'),
-- ('bruce_wayne', 'bruce@example.com', 'hashed_password9', '2024-10-09', '2024-10-09'),
-- ('steve_rogers', 'steve@example.com', 'hashed_password10', '2024-10-10', '2024-10-10'),
-- ('natasha_romanoff', 'natasha@example.com', 'hashed_password11', '2024-10-10', '2024-10-10'),
-- ('thor_odinson', 'thor@example.com', 'hashed_password12', '2024-10-11', '2024-10-11');


insert into roles (active,description, role_name)
values
    (true,'administrator roles' , 'ROLE_ADMIN'),
    (true,'user roles' , 'ROLE_USER');

insert into users (password, user_name,are_credentials_expired, is_enabled,is_expired,is_locked )
values
    ('$2a$10$bJxwWc3A3DBzke7Gnb/MZ.lLXmvOIE/DFAd6QUnBvWhn7c7D1zY4C','frans', false,true,false,false),
    ('$2a$10$bJxwWc3A3DBzke7Gnb/MZ.lLXmvOIE/DFAd6QUnBvWhn7c7D1zY4C','geert', false,true,false,false);

insert into user_role (role_id, user_id)
values
    (1,1),
    (2,2),
    (2,1);