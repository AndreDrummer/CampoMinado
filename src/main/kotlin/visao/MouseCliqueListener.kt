package visao

import modelo.Campo
import java.awt.event.MouseEvent
import java.awt.event.MouseListener

class MouseCliqueListener (
    private val onBotaoEsquerdo: (Campo) -> Unit,
    private val onBotaoDireito: (Campo) -> Unit,
    private val campo: Campo,
) : MouseListener {

    override fun mousePressed(e: MouseEvent?) {
        when(e?.button) {
            MouseEvent.BUTTON1 -> onBotaoEsquerdo(campo)
            MouseEvent.BUTTON3 -> onBotaoDireito(campo) // Pode ser o botão 2, depende do SO. Windows, Mac, etc...
        }
    }

    // funções que devem ser sobrescritas pela classe herdeira,
    // mas que não são necessárias para este app.
    override fun mouseReleased(e: MouseEvent?) {}
    override fun mouseClicked(e: MouseEvent?) {}
    override fun mouseEntered(e: MouseEvent?) {}
    override fun mouseExited(e: MouseEvent?) {}
}