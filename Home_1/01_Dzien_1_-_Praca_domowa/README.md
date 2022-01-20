![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709387-2b7ac180-571f-11eb-9b94-517aa6d501c9.png)



## Zadanie 1

1. Otwórz IDE a następnie utwórz w nim projekt o nazwie `SpringCMS`.
2. Utwórz encje o nazwie `Category`.
3. Encja ma zawierać następujące pola:
- id 
- name (max 100 znaków)
- description (może przyjmować wartość null)


## Zadanie 2

1. Utwórz encje o nazwie `Author`.
2. Encja ma zawierać następujące pola:
- id 
- firstName
- lastName


## Zadanie 3

1. Utwórz encję `Article`,
2. Encja ma zawierać następujące pola:
- id 
- title (max. 200 znaków),
- author - (powiązanie relacją do klasy `Author`) - artykuł może mieć tylko jednego autora
- categories - (powiązanie relacją do klasy `Category`) - artykuł może należeć do wielu kategorii
- content
- created (wartość ma być automatycznie dodawana podczas zapisu)
- updated (wartość ma być automatycznie zmieniana podczas edycji).


## Zadanie 4

1. Uzupełnij ręcznie dane w bazie, lub stwórz odpowiedni skrypt, który zostanie załadowany podczas startu aplikacji.
2. Utwórz klasy `ArticleDao`, `AuthorDao`, `CategoryDao`.
3. W klasach Dao utwórz metody pozwalające na:
- zapis encji
- usuwanie encji
- edycję encji

