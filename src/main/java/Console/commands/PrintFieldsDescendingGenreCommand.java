package Console.commands;

import CollectionManager.ArrayListManager;
import Console.ConsoleWriter;
import musicband.MusicBand;

import java.util.Iterator;

/**
 * Класс команды print_fields_descending_genre, выводящей поле genre всех объектов в убывающем порядке
 */
public class PrintFieldsDescendingGenreCommand extends AbstractCommand {
    private ConsoleWriter writer;
    private ArrayListManager listManager;

    /**
     * @param writer Объект класса, выводящего в консоль
     * @param listManager Менеджер коллекции
     */
    public PrintFieldsDescendingGenreCommand(ConsoleWriter writer, ArrayListManager listManager) {
        super("print_field_descending_genre", "display the genre field values of all elements in descending order");
        this.writer = writer;
        this.listManager = listManager;
    }

    /**
     * @param argument
     * @return CommandCode.DEFAULT
     */
    @Override
    public CommandCode execute(String argument) {
        String str = "";
        if (listManager.getArrayList().size() < 1) {
            str = "Collection is empty";
        } else {
            for (Iterator<MusicBand> it = listManager.sortByGenre().iterator(); it.hasNext(); ) {
                str += it.next().getGenre().name();
            }
        }
        writer.write(str);
        return CommandCode.DEFAULT;
    }
}
