package nl.first8.workshop.jdk17;

public class E03_TextBlocks {

    /*
     TODO: can we make this easier readable/editable using Text Blocks?

     It's probably easiest to start over, so here's the original text to use for copy/pasting:

<menu id="file" value="File">
  <popup>
    <menuitem value="New" onclick="CreateNewDoc()" />
    <menuitem value="Open" onclick="OpenDoc()" />
    <menuitem value="Close" onclick="CloseDoc()" />
  </popup>
</menu>

     */
    private String getTextBlock() {
        return "<menu id=\"file\" value=\"File\">\n"
                + "  <popup>\n"
                + "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\n"
                + "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\n"
                + "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\n"
                + "  </popup>\n"
                + "</menu>";
    }

    /*

     TODO use Text Blocks as well, but make sure the indentation stays...
     TODO notice how Intellij helps you show the indentation!

     It's probably easiest to start over, so here's the original text to use for copy/pasting:

    <menu id="file" value="File">
      <popup>
        <menuitem value="New" onclick="CreateNewDoc()" />
        <menuitem value="Open" onclick="OpenDoc()" />
        <menuitem value="Close" onclick="CloseDoc()" />
      </popup>
    </menu>

    */
    private String getTextBlockIndented() {
        return "    <menu id=\"file\" value=\"File\">\n"
                + "      <popup>\n"
                + "        <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\n"
                + "        <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\n"
                + "        <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\n"
                + "      </popup>\n"
                + "    </menu>";
    }

    public static void main(String[] args) {
        E03_TextBlocks instance = new E03_TextBlocks();

        System.out.println("Text block:\n" + instance.getTextBlock());

        String textBlockIndented = instance.getTextBlockIndented();
        System.out.println("Text block, indented:\n" + textBlockIndented);
        if (!textBlockIndented.startsWith("    <")) {
            throw new RuntimeException("Note! Your indentation is not correct!");
            // yes, it would be nicer to have an actual Test for this check... we've chosen to not make it more complicated than necessary :)
        }
    }

}
