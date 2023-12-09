package co.matheusabreu.meurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.matheusabreu.meurestaurante.databinding.ActivityDadosPedidos2Binding

class DadosPedidosActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityDadosPedidos2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPedidos2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val quant_cafe = i.getStringExtra("quant_cafe").toString().toInt()
        val quant_pao = i.getStringExtra("quant_pao").toString().toInt()
        val quant_chocolate = i.getStringExtra("quant_chocolate").toString().toInt()
        val preco_cafe = i.getDoubleExtra("preco_cafe",0.0).toDouble()
        val preco_pao = i.getDoubleExtra("preco_pao", 0.0)
        val preco_chocolate = i.getDoubleExtra("preco_chocolate", 0.0)

        val texto = "Resumo do pedido: \n" +
                "Café: $quant_cafe Preço: ${quant_cafe*preco_cafe}$\n" +
                "Pão: $quant_pao Preço: ${quant_pao*preco_pao}$\n" +
                "Chocolate: $quant_chocolate Preço: ${quant_chocolate*preco_chocolate}$";

        binding.textResumo.setText(texto)
    }
}