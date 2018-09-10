package kovalsikoski.johan.sendemail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send_txt_email.setOnClickListener {
            sendTextMail()
        }

        send_html_email.setOnClickListener {
            sendHtmlMail()
        }
    }

    private fun sendHtmlMail(){
        Thread(Runnable {
            try {
                val sender = HtmlEmailSender("my@email.abc",
                        "mypassword")
                sender.sendMail("Hello from JavaMail", "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                        "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                        " <head>\n" +
                        "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                        "  <title>Demystifying Email Design</title>\n" +
                        "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
                        "</head>\n" +
                        "\n" +
                        "<body style=\"margin: 0; padding: 0;\">\n" +
                        " <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" width=\"600\" style=\"border-collapse: collapse;\">\n" +
                        "  <tr>\n" +
                        "\t<td align=\"center\" bgcolor=\"#70bbd9\" style=\"padding: 40px 0 30px 0;\">\n" +
                        "\t\t<img src=\"https://images.pexels.com/photos/617278/pexels-photo-617278.jpeg\" alt=\"Criando Mágica de E-mail\" width=\"300\" height=\"230\" style=\"display: block;\" />\n" +
                        "\t</td>\n" +
                        " </tr>\n" +
                        " <tr>\n" +
                        "  <td bgcolor=\"#ffffff\">\n" +
                        "   <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                        " <tr>\n" +
                        "  <td width=\"260\" valign=\"top\">\n" +
                        "   <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                        "    <tr>\n" +
                        "     <td>\n" +
                        "      <img src=\"https://news.nationalgeographic.com/content/dam/news/2018/05/17/you-can-train-your-cat/02-cat-training-NationalGeographic_1484324.adapt.676.1.jpg\" alt=\"\" width=\"100%\" height=\"140\" style=\"display: block;\" />\n" +
                        "     </td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "     <td style=\"padding: 25px 0 0 0;\">\n" +
                        "      Lorem ipsum dolor sit amet, consectetur adipiscing elit. In tempus adipiscing felis, sit amet blandit ipsum volutpat sed. Morbi porttitor, eget accumsan dictum, nisi libero ultricies ipsum, in posuere mauris neque at erat.\n" +
                        "     </td>\n" +
                        "    </tr>\n" +
                        "   </table>\n" +
                        "  </td>\n" +
                        "  <td style=\"font-size: 0; line-height: 0;\" width=\"20\">\n" +
                        "   &nbsp;\n" +
                        "  </td>\n" +
                        "  <td width=\"260\" valign=\"top\">\n" +
                        "   <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                        "    <tr>\n" +
                        "     <td>\n" +
                        "      <img src=\"http://www.petwebsite.co.uk/media/k2/items/cache/0548677e6432786dd8df61eb3aaec139_XL.jpg\" alt=\"\" width=\"100%\" height=\"140\" style=\"display: block;\" />\n" +
                        "     </td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "     <td style=\"padding: 25px 0 0 0;\">\n" +
                        "      Lorem ipsum dolor sit amet, consectetur adipiscing elit. In tempus adipiscing felis, sit amet blandit ipsum volutpat sed. Morbi porttitor, eget accumsan dictum, nisi libero ultricies ipsum, in posuere mauris neque at erat.\n" +
                        "     </td>\n" +
                        "    </tr>\n" +
                        "   </table>\n" +
                        "  </td>\n" +
                        " </tr>\n" +
                        "</table>\n" +
                        "  </td>\n" +
                        " </tr>\n" +
                        " <tr>\n" +
                        "  <td bgcolor=\"#ee4c50\">\n" +
                        "   <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                        "\t <tr>\n" +
                        "\t  <td width=\"75%\">\n" +
                        "\t\t &reg; Alguém, Algum lugar 2014<br/>\n" +
                        "\t\t Remova sua inscrição dessa e-mail marketing, instantaneamente\n" +
                        "\t\t</td>\n" +
                        "\t  <td align=\"right\">\n" +
                        " <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                        "  <tr>\n" +
                        "   <td>\n" +
                        "    <a href=\"http://www.twitter.com/\">\n" +
                        "     <img src=\"https://cdn4.iconfinder.com/data/icons/social-media-icons-the-circle-set/48/twitter_circle-512.png\" alt=\"Twitter\" width=\"38\" height=\"38\" style=\"display: block;\" border=\"0\" />\n" +
                        "    </a>\n" +
                        "   </td>\n" +
                        "   <td style=\"font-size: 0; line-height: 0;\" width=\"20\">&nbsp;</td>\n" +
                        "   <td>\n" +
                        "    <a href=\"http://www.twitter.com/\">\n" +
                        "     <img src=\"https://pt.seaicons.com/wp-content/uploads/2015/06/facebook-icon.png\" alt=\"Facebook\" width=\"38\" height=\"38\" style=\"display: block;\" border=\"0\" />\n" +
                        "    </a>\n" +
                        "   </td>\n" +
                        "  </tr>\n" +
                        " </table>\n" +
                        "</td>\n" +
                        "\t </tr>\n" +
                        "\t</table>\n" +
                        "  </td>\n" +
                        " </tr>\n" +
                        " </table>\n" +
                        "</body>\n" +
                        "\n" +
                        "</html>"/*"<i>Greetings!</i><br><b>Wish you a nice day!</b><br><font color=red>R E D</font>"*/,
                        "my@email.abc", "tomyfriend@email.abc")
            } catch (e: Exception) {
                Log.e("abcz", e.message, e)
            }
        }).start()}

    private fun sendTextMail() {
        Thread(Runnable {
            try {
                val sender = GMailSender("my@email.abc",
                        "mypassword")
                sender.sendMail("Hello from JavaMail", "Body from JavaMail",
                        "myemail@email.abc", "tomyfriend@email.abc")
            } catch (e: Exception) {
                Log.e("abcz", e.message, e)
            }
        }).start()
    }
}