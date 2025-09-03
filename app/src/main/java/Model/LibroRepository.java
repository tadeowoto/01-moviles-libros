package Model;

import java.util.ArrayList;
import java.util.List;

public class LibroRepository {

    private List<Libro> libroList;

    public LibroRepository() {
        libroList = new ArrayList<>();

        libroList.add(new Libro(
                1,
                "Cien Años de Soledad",
                "Gabriel García Márquez",
                417,
                "Una saga épica que narra siete generaciones de la familia Buendía en Macondo, mezclando realidad y elementos mágicos en una reflexión sobre la historia latinoamericana, el amor, la soledad y el destino cíclico.",
                "https://upload.wikimedia.org/wikipedia/commons/1/1e/PrideAndPrejudiceTitlePage.jpg"
        ));

        libroList.add(new Libro(
                2,
                "1984",
                "George Orwell",
                328,
                "Una profética distopía que retrata una sociedad totalitaria donde el Gran Hermano vigila cada movimiento. Una advertencia sobre el poder, la manipulación de la verdad y la pérdida de la libertad individual.",
                "https://upload.wikimedia.org/wikipedia/commons/1/1e/PrideAndPrejudiceTitlePage.jpg"
        ));

        libroList.add(new Libro(
                3,
                "El Principito",
                "Antoine de Saint-Exupéry",
                96,
                "Un cuento poético y filosófico que, a través de la mirada inocente de un niño príncipe, explora los valores esenciales de la vida: el amor, la amistad, la responsabilidad y la crítica al mundo adulto.",
                "https://upload.wikimedia.org/wikipedia/commons/1/1e/PrideAndPrejudiceTitlePage.jpg"
        ));

        libroList.add(new Libro(
                4,
                "Orgullo y Prejuicio",
                "Jane Austen",
                432,
                "Una brillante comedia de costumbres que retrata la Inglaterra georgiana a través del romance entre Elizabeth Bennet y Mr. Darcy, explorando temas de clase social, matrimonio y los juicios precipitados.",
                "https://upload.wikimedia.org/wikipedia/commons/1/1e/PrideAndPrejudiceTitlePage.jpg"
        ));

        libroList.add(new Libro(
                5,
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                863,
                "La obra cumbre de la literatura española que narra las aventuras de Alonso Quixano, quien pierde la razón leyendo novelas de caballerías y sale al mundo como Don Quijote, acompañado de su fiel Sancho Panza.",
                "https://upload.wikimedia.org/wikipedia/commons/6/6f/Don_Quijote_and_Sancho_Panza.jpg"
        ));

        libroList.add(new Libro(
                6,
                "Matar a un Ruiseñor",
                "Harper Lee",
                281,
                "Ambientada en el sur de Estados Unidos durante los años 30, esta novela aborda el racismo y la pérdida de la inocencia a través de los ojos de Scout Finch, cuyo padre defiende a un hombre negro falsamente acusado.",
                "https://upload.wikimedia.org/wikipedia/en/7/79/To_Kill_a_Mockingbird.JPG"
        ));

        libroList.add(new Libro(
                7,
                "El Gran Gatsby",
                "F. Scott Fitzgerald",
                180,
                "Un retrato deslumbrante y trágico de la era del jazz americana, que explora la decadencia moral, el sueño americano y la obsesión destructiva del misterioso Jay Gatsby por Daisy Buchanan.",
                "https://upload.wikimedia.org/wikipedia/commons/7/7a/The_Great_Gatsby_Cover_1925_Retouched.jpg"
        ));

        libroList.add(new Libro(
                8,
                "Crimen y Castigo",
                "Fyodor Dostoievski",
                671,
                "Un profundo estudio psicológico que sigue a Raskolnikov, un estudiante empobrecido que comete un asesinato y lucha con las consecuencias morales y psicológicas de su acto en la San Petersburgo del siglo XIX.",
                "https://upload.wikimedia.org/wikipedia/commons/4/4b/Crime_and_Punishment_cover.jpg"
        ));

        libroList.add(new Libro(
                9,
                "El Conde de Montecristo",
                "Alexandre Dumas",
                1276,
                "Una épica historia de venganza que narra la transformación de Edmond Dantès desde un marinero inocente hasta el misterioso Conde, en su búsqueda de justicia contra quienes lo traicionaron.",
                "https://upload.wikimedia.org/wikipedia/commons/5/59/Dumas_-_Le_Comte_de_Monte-Cristo%2C_1846.djvu"
        ));

        libroList.add(new Libro(
                10,
                "Jane Eyre",
                "Charlotte Brontë",
                507,
                "La historia de una huérfana que supera adversidades para convertirse en una mujer independiente, explorando temas de clase, sexualidad, religión y feminismo en la Inglaterra victoriana.",
                "https://upload.wikimedia.org/wikipedia/commons/9/9b/Jane_Eyre_title_page.jpg"
        ));

        libroList.add(new Libro(
                11,
                "La Casa de los Espíritus",
                "Isabel Allende",
                448,
                "Una saga familiar que abarca cuatro generaciones de mujeres extraordinarias, mezclando elementos del realismo mágico con la historia política de Chile del siglo XX.",
                "https://upload.wikimedia.org/wikipedia/en/4/48/Casa_de_los_esp%C3%ADritus.jpg"
        ));

        libroList.add(new Libro(
                12,
                "Rayuela",
                "Julio Cortázar",
                635,
                "Una novela experimental que puede leerse de múltiples formas, explorando la búsqueda existencial de Horacio Oliveira entre París y Buenos Aires, revolucionando la narrativa latinoamericana.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Rayuela_Julio_Cortazar.jpg/256px-Rayuela_Julio_Cortazar.jpg"
        ));

        libroList.add(new Libro(
                13,
                "Pedro Páramo",
                "Juan Rulfo",
                124,
                "Una obra maestra del realismo mágico que narra el viaje de Juan Preciado al pueblo fantasmal de Comala en busca de su padre, Pedro Páramo, entrelazando voces de vivos y muertos.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Pedro_P%C3%A1ramo_first_edition.jpg/256px-Pedro_P%C3%A1ramo_first_edition.jpg"
        ));

        libroList.add(new Libro(
                14,
                "Dune",
                "Frank Herbert",
                688,
                "Una épica de ciencia ficción que combina política, religión, ecología y aventura en el planeta desértico Arrakis, donde la especia más valiosa del universo determina el destino de civilizaciones enteras.",
                "https://upload.wikimedia.org/wikipedia/en/d/de/Dune-Frank_Herbert_%281965%29_First_edition.jpg"
        ));

        libroList.add(new Libro(
                15,
                "El Señor de los Anillos: La Comunidad del Anillo",
                "J.R.R. Tolkien",
                423,
                "El inicio de la épica fantasía que sigue a Frodo Bolsón y la Comunidad del Anillo en su misión para destruir el Anillo Único y derrotar al Señor Oscuro Sauron en la Tierra Media.",
                "https://upload.wikimedia.org/wikipedia/en/8/8e/The_Fellowship_of_the_Ring_cover.gif"
        ));

        libroList.add(new Libro(
                16,
                "Fahrenheit 451",
                "Ray Bradbury",
                158,
                "Una distopía sobre una sociedad futura donde los libros están prohibidos y los 'bomberos' se dedican a quemarlos, explorando temas de censura, conformidad y el poder transformador de la literatura.",
                "https://upload.wikimedia.org/wikipedia/en/d/db/Fahrenheit_451_1st_ed_cover.jpg"
        ));

        libroList.add(new Libro(
                17,
                "El Amor en los Tiempos del Cólera",
                "Gabriel García Márquez",
                348,
                "Una historia de amor que abarca más de medio siglo, explorando la pasión, la fidelidad y la persistencia del amor verdadero a través de la relación entre Florentino Ariza y Fermina Daza.",
                "https://upload.wikimedia.org/wikipedia/en/6/62/Love_in_the_Time_of_Cholera.jpg"
        ));

        libroList.add(new Libro(
                18,
                "Los Miserables",
                "Victor Hugo",
                1463,
                "Una monumental obra que retrata la Francia del siglo XIX a través de la historia de Jean Valjean, explorando temas de justicia, redención, amor y la lucha entre el bien y el mal.",
                "https://upload.wikimedia.org/wikipedia/commons/3/3f/Lesmiserables.jpg"
        ));

        libroList.add(new Libro(
                19,
                "Beloved",
                "Toni Morrison",
                324,
                "Una poderosa novela sobre los traumas de la esclavitud en Estados Unidos, que narra la historia de Sethe, una esclava fugitiva perseguida por los fantasmas de su pasado.",
                "https://upload.wikimedia.org/wikipedia/en/7/77/Beloved_%28Morrison_novel%29.jpg"
        ));

        libroList.add(new Libro(
                20,
                "El Nombre de la Rosa",
                "Umberto Eco",
                536,
                "Un misterio medieval ambientado en una abadía italiana del siglo XIV, donde el monje franciscano Guillermo de Baskerville investiga una serie de muertes misteriosas, combinando filosofía, teología e historia.",
                "https://upload.wikimedia.org/wikipedia/en/f/fb/NomeRosa.jpg"
        ));

        libroList.add(new Libro(
                21,
                "El Código Da Vinci",
                "Dan Brown",
                454,
                "Un thriller que combina arte, historia y religión cuando el simbologista Robert Langdon se ve envuelto en un misterio que podría cambiar la historia del cristianismo.",
                "https://upload.wikimedia.org/wikipedia/en/6/6b/DaVinciCode.jpg"
        ));

        libroList.add(new Libro(
                22,
                "Asesinato en el Orient Express",
                "Agatha Christie",
                256,
                "El famoso detective belga Hercule Poirot debe resolver un asesinato cometido durante un viaje en el lujoso Orient Express, donde cada pasajero tiene motivos y secretos que ocultar.",
                "https://upload.wikimedia.org/wikipedia/en/c/c0/Murder_on_the_Orient_Express_First_Edition_Cover_1934.jpg"
        ));

        libroList.add(new Libro(
                23,
                "Yo Soy Malala",
                "Malala Yousafzai",
                327,
                "Las memorias inspiradoras de la activista paquistaní más joven en ganar el Premio Nobel de la Paz, narrando su lucha por la educación de las niñas y su supervivencia al atentado talibán.",
                "https://upload.wikimedia.org/wikipedia/en/4/40/I_Am_Malala_book_cover.jpg"
        ));

        libroList.add(new Libro(
                24,
                "Steve Jobs",
                "Walter Isaacson",
                656,
                "La biografía autorizada del cofundador de Apple, basada en más de cuarenta entrevistas exclusivas, que revela la personalidad compleja del visionario que revolucionó la tecnología moderna.",
                "https://upload.wikimedia.org/wikipedia/en/e/e4/Steve_Jobs_by_Walter_Isaacson.jpg"
        ));

        libroList.add(new Libro(
                25,
                "El Hombre en Busca de Sentido",
                "Viktor Frankl",
                165,
                "Las reflexiones profundas de un psiquiatra superviviente del Holocausto sobre la búsqueda de propósito en la vida, incluso en las circunstancias más extremas, fundando las bases de la logoterapia.",
                "https://upload.wikimedia.org/wikipedia/en/3/33/Man%27s_Search_for_Meaning.jpg"
        ));
    }

    public List<Libro> getAllLibros() {
        return libroList;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libroList) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}

