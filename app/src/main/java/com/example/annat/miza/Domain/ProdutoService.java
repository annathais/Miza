package com.example.annat.miza.Domain;

import com.example.annat.miza.R;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private static List<Produto> produtos = new ArrayList<Produto>();

    public static List<Produto> getProdutos(){
        return produtos;
    }

    public static void saveProdutos(String nomeProduto, BigDecimal precoProduto, int lote,
                                    String supermercado, String departamento, byte[] imagem){
        try{
            //produtos.add(new Produto(nomeProduto, precoProduto, lote, supermercado, departamento, imagem));
            //produtos.add(new Produto(nomeProduto, precoProduto, departamento));
        }catch (Error error){

        }
    }

    public static void criarProduto(){
        //Produtos O Barateiro
        produtos.add(new Produto("Sabão em Pó OMO Multiação 2 Kg", new BigDecimal(21.99), "Limpeza", "O Barateiro", R.drawable.sabao_em_po_omo_multiacao_2_kg));
        produtos.add(new Produto("Limpador para Sanitário QUALITÁ Herbal 500ml", new BigDecimal(5.99), "Limpeza", "O Barateiro", R.drawable.limpador_para_sanitario_qualita_herbal_500ml));
        produtos.add(new Produto("Limpador Perfumado QUALITÁ Lima Limão 1 Litro", new BigDecimal(4.99), "Limpeza", "O Barateiro", R.drawable.limpador_perfumado_qualita_lima_limao_1_litro));
        produtos.add(new Produto("Inseticida Aerossol BAYGON Mata Baratas e Formigas 395ml", new BigDecimal(7.99), "Limpeza", "O Barateiro", R.drawable.inseticida_aerossol_baygon_mata_baratas_e_formigas_395ml));
        produtos.add(new Produto("Odorizador de Ambientes GLADE Automatic Spray Vanilla Refil 269ml", new BigDecimal(21.25), "Limpeza", "O Barateiro", R.drawable.odorizador_de_ambientes_glade_automatic_spray_vanilla_refil_269ml));
        produtos.add(new Produto("Água Sanitária SUPER CANDIDA 1 Litro", new BigDecimal(2.55), "Limpeza", "O Barateiro", R.drawable.agua_sanitaria_super_candida_1_litro));
        produtos.add(new Produto("Detergente Líquido YPÊ de Maçã 500ml", new BigDecimal(1.45), "Limpeza", "O Barateiro", R.drawable.detergente_liquido_ype_de_maca_500ml));
        produtos.add(new Produto("Suco Integral de Manga CAMPO LARGO Garrafa 900ml", new BigDecimal(8.59), "Bebidas", "O Barateiro", R.drawable.suco_integral_de_manga_campo_largo_garrafa_900ml));
        produtos.add(new Produto("Refrigerante FANTA Guaraná Lata 350ml", new BigDecimal(2.55), "Bebidas", "O Barateiro", R.drawable.refrigerante_fanta_guarana_lata_350ml));
        produtos.add(new Produto("Isotônico GATORADE Sabor Morango e Maracujá 500ml", new BigDecimal(4.09), "Bebidas", "O Barateiro", R.drawable.isotonico_gatorade_sabor_morango_e_maracuja_500ml));
        produtos.add(new Produto("Suco de Uva Integral SUPERBOM Frutts Garrafa 1 Litro", new BigDecimal(14.90), "Bebidas", "O Barateiro", R.drawable.suco_de_uva_integral_superbom_frutts_garrafa_1_litro));
        produtos.add(new Produto("Energético RED BULL Sugar Free Lata 250ml", new BigDecimal(7.09), "Bebidas", "O Barateiro", R.drawable.energetico_red_bull_sugar_free_lata_250ml));
        produtos.add(new Produto("Refrigerante COCA COLA Zero Garrafa 2 Litros", new BigDecimal(6.35), "Bebidas", "O Barateiro", R.drawable.refrigerante_coca_cola_zero_garrafa_2_litros));
        produtos.add(new Produto("Refrigerante FANTA Laranja Garrafa 2 Litros", new BigDecimal(6.29), "Bebidas", "O Barateiro", R.drawable.refrigerante_fanta_laranja_garrafa_2_litros));
        produtos.add(new Produto("Filezinho de Frango Congelado SEARA 1kg", new BigDecimal(10.50), "Açogue", "O Barateiro", R.drawable.filezinho_de_frango_congelado_seara_1kg));
        produtos.add(new Produto("Meio Asa de Frango Congelado Zip SEARA 1kg", new BigDecimal(16.87), "Açogue", "O Barateiro", R.drawable.meio_asa_de_frango_congelado_zip_seara_1kg));
        produtos.add(new Produto("Contra Filé Maturada FRIBOI Resfriado Pedaço 1,5kg", new BigDecimal(47.23), "Açogue", "O Barateiro", R.drawable.contra_file_maturada_friboi_resfriado_pedaco_1_5kg));
        produtos.add(new Produto("Camarão Descascado e Cozido 36/40 QUALITÁ Pacote 400g", new BigDecimal(76.90), "Açogue", "O Barateiro", R.drawable.camarao_descascado_e_cozido_3640_qualita_pacote_400g));
        produtos.add(new Produto("Lombo Suíno Temperado Congelado QUALITÁ 1,8kg", new BigDecimal(36.61), "Açogue", "O Barateiro", R.drawable.lombo_suino_temperado_congelado_qualita_1_8kg));
        produtos.add(new Produto("Posta de Bacalhau Dessalgado Congelado RIBERALVES 800g", new BigDecimal(34.90), "Açogue", "O Barateiro", R.drawable.posta_de_bacalhau_dessalgado_congelado_riberalves_800g));
        produtos.add(new Produto("Coxão Mole Resfriado DO CHEF Bandeja 400g", new BigDecimal(12.60), "Açogue", "O Barateiro", R.drawable.coxao_mole_resfriado_do_chef_bandeja_400g));
        produtos.add(new Produto("Papel Higiênico Folha Dupla 50m Personal 20 Unidades", new BigDecimal(47.59), "Higiene", "O Barateiro", R.drawable.papel_higienico_folha_dupla_50m_personal_20_unidades));
        produtos.add(new Produto("Sabonete em Barra Corporal Dove Original 90g 6 Unidades", new BigDecimal(12.45), "Higiene", "O Barateiro", R.drawable.sabonete_em_barra_corporal_dove_original_90g_6_unidades));
        produtos.add(new Produto("Desodorante Aerosol Nivea Dry Impact Masculino 150ml", new BigDecimal(14.90), "Higiene", "O Barateiro", R.drawable.desodorante_aerosol_nivea_dry_impact_masculino_150ml));
        produtos.add(new Produto("Aparelho de Barbear Descartável Gillette Prestobarba Ultragrip - 2 Unidades", new BigDecimal(9.29), "Higiene", "O Barateiro", R.drawable.aparelho_de_barbear_descartavel_gillette_prestobarba_ultragrip));
        produtos.add(new Produto("Shampoo Infantil Johnson's Baby Original 400ml", new BigDecimal(16.19), "Higiene", "O Barateiro", R.drawable.shampoo_infantil_johnson_s_baby_original_400ml));
        produtos.add(new Produto("Loção Hidratante Original Nívea Milk 400ml", new BigDecimal(15.49), "Higiene", "O Barateiro", R.drawable.locao_hidratante_original_nivea_milk_400ml));
        produtos.add(new Produto("Sabonete em Barra Corporal Phebo Odor de Rosas 90g", new BigDecimal(3.59), "Higiene", "O Barateiro", R.drawable.sabonete_em_barra_corporal_phebo_odor_de_rosas_90g));
        produtos.add(new Produto("Banana Nanica Hortmix 500g", new BigDecimal(2.49), "Hortifruti", "O Barateiro", R.drawable.banana_nanica_hortmix_500g));
        produtos.add(new Produto("Alface Lisa Hidropônico", new BigDecimal(2.49), "Hortifruti", "O Barateiro", R.drawable.alface_lisa_hidroponico));
        produtos.add(new Produto("Tomate Hortmix 500g", new BigDecimal(2.69), "Hortifruti", "O Barateiro", R.drawable.tomate_hortmix_500g));
        produtos.add(new Produto("Rúcula em Maço", new BigDecimal(3.99), "Hortifruti", "O Barateiro", R.drawable.rucula_em_maco));
        produtos.add(new Produto("Cebolinha em Maço", new BigDecimal(2.99), "Hortifruti", "O Barateiro", R.drawable.cebolinha_em_maco));
        produtos.add(new Produto("Pistache Torrado Selection 110g", new BigDecimal(23.49), "Hortifruti", "O Barateiro", R.drawable.pistache_torrado_selection_110g));
        produtos.add(new Produto("Mix de Couve Flor com Brócolis Ninja Resfriado Picado 250g", new BigDecimal(5.99), "Hortifruti", "O Barateiro", R.drawable.mix_de_couve_flor_com_brocolis_ninja_resfriado_picado_250g));
        produtos.add(new Produto("Ração para Cachorro Adulto Pedigree 10,1Kg", new BigDecimal(84.99), "Petshop", "O Barateiro", R.drawable.racao_para_cachorro_adulto_pedigree_10_1kg));
        produtos.add(new Produto("Ração para Gatos Adulto Whiskas Frango e Leite 3Kg", new BigDecimal(44.99), "Petshop", "O Barateiro", R.drawable.racao_para_gatos_adulto_whiskas_frango_e_leite_3kg));
        produtos.add(new Produto("Ração Úmida para Cachorro Pedigree Carne com Molho Sachê 100g", new BigDecimal(2.19), "Petshop", "O Barateiro", R.drawable.racao_umida_para_cachorro_pedigree_carne_com_molho_sache_100g));
        produtos.add(new Produto("Ração Úmida para Gato Whiskas Frango Sachê 85g", new BigDecimal(2.09), "Petshop", "O Barateiro", R.drawable.racao_umida_para_gato_whiskas_frango_sache_85g));
        produtos.add(new Produto("Areia Floral Pipicat 4Kg", new BigDecimal(12.39), "Petshop", "O Barateiro", R.drawable.areia_floral_pipicat_4kg));
        produtos.add(new Produto("Petisco Raças Grandes para Cachorro Pedrigree sabor Carne 270g", new BigDecimal(14.99), "Petshop", "O Barateiro", R.drawable.petisco_racas_grandes_para_cachorro_pedrigree_sabor_carne_270g));
        produtos.add(new Produto("Ração Úmida para Cachorro Adulto Pedigree Patê de Carne 280g", new BigDecimal(5.49), "Petshop", "O Barateiro", R.drawable.racao_umida_para_cachorro_adulto_pedigree_pate_de_carne_280g));
        produtos.add(new Produto("Arroz Branco Longo-fino Tipo 1 Camil Todo Dia 5Kg", new BigDecimal(14.99), "Cereais", "O Barateiro", R.drawable.arroz_branco_longo_fino_tipo_1_camil_todo_dia_5kg));
        produtos.add(new Produto("Feijão Carioca Tipo 1 Broto Legal 1 Kg", new BigDecimal(4.99), "Cereais", "O Barateiro", R.drawable.feijao_carioca_tipo_1_broto_legal_1_kg));
        produtos.add(new Produto("Arroz Agulhinha Tipo 1 PILECCO NOBRE Pacote 5kg", new BigDecimal(16.29), "Cereais", "O Barateiro", R.drawable.arroz_agulhinha_tipo_1_pilecco_nobre_pacote_5kg));
        produtos.add(new Produto("Feijão Branco CAMIL Pacote 500g", new BigDecimal(5.15), "Cereais", "O Barateiro", R.drawable.feijao_branco_camil_pacote_500g));
        produtos.add(new Produto("Feijão Preto Pronto CAMIL Caixa 380g", new BigDecimal(4.79), "Cereais", "O Barateiro", R.drawable.feijao_preto_pronto_camil_caixa_380g));
        produtos.add(new Produto("Arroz Integral 7 Cereais + Soja TIO JOÃO Pacote 500g", new BigDecimal(7.75), "Cereais", "O Barateiro", R.drawable.arroz_integral_7_cereais_mais_soja_tio_joao_pacote_500g));
        produtos.add(new Produto("Lentilha YOKI Pacote 500g", new BigDecimal(9.45), "Cereais", "O Barateiro", R.drawable.lentilha_yoki_pacote_500g));
        produtos.add(new Produto("Milho Verde em Conserva Quero Lata 200g", new BigDecimal(1.79), "Enlatados", "O Barateiro", R.drawable.milho_verde_em_conserva_quero_lata_200g));
        produtos.add(new Produto("Sardinha em Óleo Coqueiro Pescados 125g", new BigDecimal(3.49), "Enlatados", "O Barateiro", R.drawable.sardinha_em_oleo_coqueiro_pescados_125g));
        produtos.add(new Produto("Azeitona Verde sem Caroço Vale Fértil 160g", new BigDecimal(8.69), "Enlatados", "O Barateiro", R.drawable.azeitona_verde_sem_caroco_vale_fertil_160g));
        produtos.add(new Produto("Atum Ralado ao Natural Light Gomes da Costa 170g", new BigDecimal(4.99), "Enlatados", "O Barateiro", R.drawable.atum_ralado_ao_natural_light_gomes_da_costa_170g));
        produtos.add(new Produto("Ervilha Quero em Lata 200g", new BigDecimal(1.69), "Enlatados", "O Barateiro", R.drawable.ervilha_quero_em_lata_200g));
        produtos.add(new Produto("Azeite Português Extra Virgem Tradicional Gallo Lata 500ml", new BigDecimal(19.39), "Enlatados", "O Barateiro", R.drawable.azeite_portugues_extra_virgem_tradicional_gallo_lata_500ml));
        produtos.add(new Produto("Medalhão Vegetariano ao Molho Madeira SUPERBOM 400g", new BigDecimal(14.50), "Enlatados", "O Barateiro", R.drawable.medalhao_vegetariano_ao_molho_madeira_superbom_400g));
        produtos.add(new Produto("Queijo Parmesão Ralado Vigor 100g", new BigDecimal(7.99), "Laticíneos", "O Barateiro", R.drawable.queijo_parmesao_ralado_vigor_100g));
        produtos.add(new Produto("Requeijão Cremoso Danone 200g", new BigDecimal(4.99), "Laticíneos", "O Barateiro", R.drawable.requeijao_cremoso_danone_200g));
        produtos.add(new Produto("Queijo Processado em Cubos Polenguinho 136g", new BigDecimal(7.79), "Laticíneos", "O Barateiro", R.drawable.queijo_processado_em_cubos_polenguinho_136g));
        produtos.add(new Produto("Queijo Parmesão Ralado Tirolez 100g", new BigDecimal(10.29), "Laticíneos", "O Barateiro", R.drawable.queijo_parmesao_ralado_tirolez_100g));
        produtos.add(new Produto("Requeijão Cremoso Tradicional Catupiry 500g", new BigDecimal(12.89), "Laticíneos", "O Barateiro", R.drawable.requeijao_cremoso_tradicional_catupiry_500g));
        produtos.add(new Produto("Cream Cheese em Pasta Philadelphia 300g", new BigDecimal(12.99), "Laticíneos", "O Barateiro", R.drawable.cream_cheese_em_pasta_philadelphia_300g));
        produtos.add(new Produto("Queijo Parmesão Light Ralado Faixa Azul 50g", new BigDecimal(6.79), "Laticíneos", "O Barateiro", R.drawable.queijo_parmesao_light_ralado_faixa_azul_50g));
        produtos.add(new Produto("Salame Italiano Fatiado Aurora 100g", new BigDecimal(9.19), "Frios", "O Barateiro", R.drawable.salame_italiano_fatiado_aurora_100g));
        produtos.add(new Produto("Linguiça Mista Defumada Perdigão 240g", new BigDecimal(4.99), "Frios", "O Barateiro", R.drawable.linguica_mista_defumada_perdigao_240g));
        produtos.add(new Produto("Linguiça Calabresa Defumada Perdigão 400g", new BigDecimal(8.99), "Frios", "O Barateiro", R.drawable.linguica_calabresa_defumada_perdigao_400g));
        produtos.add(new Produto("Mortadela Defumada Fatiado Sadia", new BigDecimal(4.99), "Frios", "O Barateiro", R.drawable.mortadela_defumada_fatiado_sadia));
        produtos.add(new Produto("Presunto Fatiado Sadia 200g", new BigDecimal(7.99), "Frios", "O Barateiro", R.drawable.presunto_fatiado_sadia_200g));
        produtos.add(new Produto("Linguiça Portuguesa Defumada Perdigão 400g", new BigDecimal(12.49), "Frios", "O Barateiro", R.drawable.linguica_portuguesa_defumada_perdigao_400g));
        produtos.add(new Produto("Salamitos Poket SADIA Pacote 36g", new BigDecimal(6.59), "Frios", "O Barateiro", R.drawable.salamitos_poket_sadia_pacote_36g));

        //Produtos AKI TEM
        produtos.add(new Produto("Sabão em Pó OMO Multiação 2 Kg", new BigDecimal(20.99), "Limpeza", "Aki Tem", R.drawable.sabao_em_po_omo_multiacao_2_kg));
        produtos.add(new Produto("Limpador para Sanitário QUALITÁ Herbal 500ml", new BigDecimal(5.59), "Limpeza", "Aki Tem", R.drawable.limpador_para_sanitario_qualita_herbal_500ml));
        produtos.add(new Produto("Limpador Perfumado QUALITÁ Lima Limão 1 Litro", new BigDecimal(5.99), "Limpeza", "Aki Tem", R.drawable.limpador_perfumado_qualita_lima_limao_1_litro));
        produtos.add(new Produto("Inseticida Aerossol BAYGON Mata Baratas e Formigas 395ml", new BigDecimal(8.99), "Limpeza", "Aki Tem", R.drawable.inseticida_aerossol_baygon_mata_baratas_e_formigas_395ml));
        produtos.add(new Produto("Odorizador de Ambientes GLADE Automatic Spray Vanilla Refil 269ml", new BigDecimal(21.05), "Limpeza", "Aki Tem", R.drawable.odorizador_de_ambientes_glade_automatic_spray_vanilla_refil_269ml));
        produtos.add(new Produto("Água Sanitária SUPER CANDIDA 1 Litro", new BigDecimal(2.95), "Limpeza", "Aki Tem", R.drawable.agua_sanitaria_super_candida_1_litro));
        produtos.add(new Produto("Detergente Líquido YPÊ de Maçã 500ml", new BigDecimal(1.25), "Limpeza", "Aki Tem", R.drawable.detergente_liquido_ype_de_maca_500ml));
        produtos.add(new Produto("Suco Integral de Manga CAMPO LARGO Garrafa 900ml", new BigDecimal(8.80), "Bebidas", "Aki Tem", R.drawable.suco_integral_de_manga_campo_largo_garrafa_900ml));
        produtos.add(new Produto("Refrigerante FANTA Guaraná Lata 350ml", new BigDecimal(2.55), "Bebidas", "Aki Tem", R.drawable.refrigerante_fanta_guarana_lata_350ml));
        produtos.add(new Produto("Isotônico GATORADE Sabor Morango e Maracujá 500ml", new BigDecimal(3.59), "Bebidas", "Aki Tem", R.drawable.isotonico_gatorade_sabor_morango_e_maracuja_500ml));
        produtos.add(new Produto("Suco de Uva Integral SUPERBOM Frutts Garrafa 1 Litro", new BigDecimal(15.90), "Bebidas", "Aki Tem", R.drawable.suco_de_uva_integral_superbom_frutts_garrafa_1_litro));
        produtos.add(new Produto("Energético RED BULL Sugar Free Lata 250ml", new BigDecimal(7.89), "Bebidas", "Aki Tem", R.drawable.energetico_red_bull_sugar_free_lata_250ml));
        produtos.add(new Produto("Refrigerante COCA COLA Zero Garrafa 2 Litros", new BigDecimal(7.35), "Bebidas", "Aki Tem", R.drawable.refrigerante_coca_cola_zero_garrafa_2_litros));
        produtos.add(new Produto("Refrigerante FANTA Laranja Garrafa 2 Litros", new BigDecimal(6.89), "Bebidas", "Aki Tem", R.drawable.refrigerante_fanta_laranja_garrafa_2_litros));
        produtos.add(new Produto("Filezinho de Frango Congelado SEARA 1kg", new BigDecimal(10.00), "Açogue", "Aki Tem", R.drawable.filezinho_de_frango_congelado_seara_1kg));
        produtos.add(new Produto("Meio Asa de Frango Congelado Zip SEARA 1kg", new BigDecimal(14.87), "Açogue", "Aki Tem", R.drawable.meio_asa_de_frango_congelado_zip_seara_1kg));
        produtos.add(new Produto("Contra Filé Maturada FRIBOI Resfriado Pedaço 1,5kg", new BigDecimal(48.23), "Açogue", "Aki Tem", R.drawable.contra_file_maturada_friboi_resfriado_pedaco_1_5kg));
        produtos.add(new Produto("Camarão Descascado e Cozido 36/40 QUALITÁ Pacote 400g", new BigDecimal(72.90), "Açogue", "Aki Tem", R.drawable.camarao_descascado_e_cozido_3640_qualita_pacote_400g));
        produtos.add(new Produto("Lombo Suíno Temperado Congelado QUALITÁ 1,8kg", new BigDecimal(36.89), "Açogue", "Aki Tem", R.drawable.lombo_suino_temperado_congelado_qualita_1_8kg));
        produtos.add(new Produto("Posta de Bacalhau Dessalgado Congelado RIBERALVES 800g", new BigDecimal(34.20), "Açogue", "Aki Tem", R.drawable.posta_de_bacalhau_dessalgado_congelado_riberalves_800g));
        produtos.add(new Produto("Coxão Mole Resfriado DO CHEF Bandeja 400g", new BigDecimal(12.60), "Açogue", "Aki Tem", R.drawable.coxao_mole_resfriado_do_chef_bandeja_400g));
        produtos.add(new Produto("Papel Higiênico Folha Dupla 50m Personal 20 Unidades", new BigDecimal(46.59), "Higiene", "Aki Tem", R.drawable.papel_higienico_folha_dupla_50m_personal_20_unidades));
        produtos.add(new Produto("Sabonete em Barra Corporal Dove Original 90g 6 Unidades", new BigDecimal(12.85), "Higiene", "Aki Tem", R.drawable.sabonete_em_barra_corporal_dove_original_90g_6_unidades));
        produtos.add(new Produto("Desodorante Aerosol Nivea Dry Impact Masculino 150ml", new BigDecimal(14.99), "Higiene", "Aki Tem", R.drawable.desodorante_aerosol_nivea_dry_impact_masculino_150ml));
        produtos.add(new Produto("Aparelho de Barbear Descartável Gillette Prestobarba Ultragrip - 2 Unidades", new BigDecimal(8.29), "Higiene", "Aki Tem", R.drawable.aparelho_de_barbear_descartavel_gillette_prestobarba_ultragrip));
        produtos.add(new Produto("Shampoo Infantil Johnson's Baby Original 400ml", new BigDecimal(16.99), "Higiene", "Aki Tem", R.drawable.shampoo_infantil_johnson_s_baby_original_400ml));
        produtos.add(new Produto("Loção Hidratante Original Nívea Milk 400ml", new BigDecimal(15.89), "Higiene", "Aki Tem", R.drawable.locao_hidratante_original_nivea_milk_400ml));
        produtos.add(new Produto("Sabonete em Barra Corporal Phebo Odor de Rosas 90g", new BigDecimal(4.59), "Higiene", "Aki Tem", R.drawable.sabonete_em_barra_corporal_phebo_odor_de_rosas_90g));
        produtos.add(new Produto("Banana Nanica Hortmix 500g", new BigDecimal(2.99), "Hortifruti", "Aki Tem", R.drawable.banana_nanica_hortmix_500g));
        produtos.add(new Produto("Alface Lisa Hidropônico", new BigDecimal(2.99), "Hortifruti", "Aki Tem", R.drawable.alface_lisa_hidroponico));
        produtos.add(new Produto("Tomate Hortmix 500g", new BigDecimal(2.29), "Hortifruti", "Aki Tem", R.drawable.tomate_hortmix_500g));
        produtos.add(new Produto("Rúcula em Maço", new BigDecimal(3.29), "Hortifruti", "Aki Tem", R.drawable.rucula_em_maco));
        produtos.add(new Produto("Cebolinha em Maço", new BigDecimal(2.29), "Hortifruti", "Aki Tem", R.drawable.cebolinha_em_maco));
        produtos.add(new Produto("Pistache Torrado Selection 110g", new BigDecimal(21.49), "Hortifruti", "Aki Tem", R.drawable.pistache_torrado_selection_110g));
        produtos.add(new Produto("Mix de Couve Flor com Brócolis Ninja Resfriado Picado 250g", new BigDecimal(5.59), "Hortifruti", "Aki Tem", R.drawable.mix_de_couve_flor_com_brocolis_ninja_resfriado_picado_250g));
        produtos.add(new Produto("Ração para Cachorro Adulto Pedigree 10,1Kg", new BigDecimal(85.99), "Petshop", "Aki Tem", R.drawable.racao_para_cachorro_adulto_pedigree_10_1kg));
        produtos.add(new Produto("Ração para Gatos Adulto Whiskas Frango e Leite 3Kg", new BigDecimal(45.99), "Petshop", "Aki Tem", R.drawable.racao_para_gatos_adulto_whiskas_frango_e_leite_3kg));
        produtos.add(new Produto("Ração Úmida para Cachorro Pedigree Carne com Molho Sachê 100g", new BigDecimal(2.09), "Petshop", "Aki Tem", R.drawable.racao_umida_para_cachorro_pedigree_carne_com_molho_sache_100g));
        produtos.add(new Produto("Ração Úmida para Gato Whiskas Frango Sachê 85g", new BigDecimal(2.59), "Petshop", "Aki Tem", R.drawable.racao_umida_para_gato_whiskas_frango_sache_85g));
        produtos.add(new Produto("Areia Floral Pipicat 4Kg", new BigDecimal(12.89), "Petshop", "Aki Tem", R.drawable.areia_floral_pipicat_4kg));
        produtos.add(new Produto("Petisco Raças Grandes para Cachorro Pedrigree sabor Carne 270g", new BigDecimal(13.99), "Petshop", "Aki Tem", R.drawable.petisco_racas_grandes_para_cachorro_pedrigree_sabor_carne_270g));
        produtos.add(new Produto("Ração Úmida para Cachorro Adulto Pedigree Patê de Carne 280g", new BigDecimal(5.99), "Petshop", "Aki Tem", R.drawable.racao_umida_para_cachorro_adulto_pedigree_pate_de_carne_280g));
        produtos.add(new Produto("Arroz Branco Longo-fino Tipo 1 Camil Todo Dia 5Kg", new BigDecimal(13.99), "Cereais", "Aki Tem", R.drawable.arroz_branco_longo_fino_tipo_1_camil_todo_dia_5kg));
        produtos.add(new Produto("Feijão Carioca Tipo 1 Broto Legal 1 Kg", new BigDecimal(4.59), "Cereais", "Aki Tem", R.drawable.feijao_carioca_tipo_1_broto_legal_1_kg));
        produtos.add(new Produto("Arroz Agulhinha Tipo 1 PILECCO NOBRE Pacote 5kg", new BigDecimal(15.29), "Cereais", "Aki Tem", R.drawable.arroz_agulhinha_tipo_1_pilecco_nobre_pacote_5kg));
        produtos.add(new Produto("Feijão Branco CAMIL Pacote 500g", new BigDecimal(5.55), "Cereais", "Aki Tem", R.drawable.feijao_branco_camil_pacote_500g));
        produtos.add(new Produto("Feijão Preto Pronto CAMIL Caixa 380g", new BigDecimal(4.29), "Cereais", "Aki Tem", R.drawable.feijao_preto_pronto_camil_caixa_380g));
        produtos.add(new Produto("Arroz Integral 7 Cereais + Soja TIO JOÃO Pacote 500g", new BigDecimal(6.75), "Cereais", "Aki Tem", R.drawable.arroz_integral_7_cereais_mais_soja_tio_joao_pacote_500g));
        produtos.add(new Produto("Lentilha YOKI Pacote 500g", new BigDecimal(9.95), "Cereais", "Aki Tem", R.drawable.lentilha_yoki_pacote_500g));
        produtos.add(new Produto("Milho Verde em Conserva Quero Lata 200g", new BigDecimal(1.99), "Enlatados", "Aki Tem", R.drawable.milho_verde_em_conserva_quero_lata_200g));
        produtos.add(new Produto("Sardinha em Óleo Coqueiro Pescados 125g", new BigDecimal(3.09), "Enlatados", "Aki Tem", R.drawable.sardinha_em_oleo_coqueiro_pescados_125g));
        produtos.add(new Produto("Azeitona Verde sem Caroço Vale Fértil 160g", new BigDecimal(7.69), "Enlatados", "Aki Tem", R.drawable.azeitona_verde_sem_caroco_vale_fertil_160g));
        produtos.add(new Produto("Atum Ralado ao Natural Light Gomes da Costa 170g", new BigDecimal(5.99), "Enlatados", "Aki Tem", R.drawable.atum_ralado_ao_natural_light_gomes_da_costa_170g));
        produtos.add(new Produto("Ervilha Quero em Lata 200g", new BigDecimal(1.99), "Enlatados", "Aki Tem", R.drawable.ervilha_quero_em_lata_200g));
        produtos.add(new Produto("Azeite Português Extra Virgem Tradicional Gallo Lata 500ml", new BigDecimal(18.39), "Enlatados", "Aki Tem", R.drawable.azeite_portugues_extra_virgem_tradicional_gallo_lata_500ml));
        produtos.add(new Produto("Medalhão Vegetariano ao Molho Madeira SUPERBOM 400g", new BigDecimal(15.50), "Enlatados", "Aki Tem", R.drawable.medalhao_vegetariano_ao_molho_madeira_superbom_400g));
        produtos.add(new Produto("Queijo Parmesão Ralado Vigor 100g", new BigDecimal(8.99), "Laticíneos", "Aki Tem", R.drawable.queijo_parmesao_ralado_vigor_100g));
        produtos.add(new Produto("Requeijão Cremoso Danone 200g", new BigDecimal(5.99), "Laticíneos", "Aki Tem", R.drawable.requeijao_cremoso_danone_200g));
        produtos.add(new Produto("Queijo Processado em Cubos Polenguinho 136g", new BigDecimal(8.79), "Laticíneos", "Aki Tem", R.drawable.queijo_processado_em_cubos_polenguinho_136g));
        produtos.add(new Produto("Queijo Parmesão Ralado Tirolez 100g", new BigDecimal(11.29), "Laticíneos", "Aki Tem", R.drawable.queijo_parmesao_ralado_tirolez_100g));
        produtos.add(new Produto("Requeijão Cremoso Tradicional Catupiry 500g", new BigDecimal(13.89), "Laticíneos", "Aki Tem", R.drawable.requeijao_cremoso_tradicional_catupiry_500g));
        produtos.add(new Produto("Cream Cheese em Pasta Philadelphia 300g", new BigDecimal(12.49), "Laticíneos", "Aki Tem", R.drawable.cream_cheese_em_pasta_philadelphia_300g));
        produtos.add(new Produto("Queijo Parmesão Light Ralado Faixa Azul 50g", new BigDecimal(7.79), "Laticíneos", "Aki Tem", R.drawable.queijo_parmesao_light_ralado_faixa_azul_50g));
        produtos.add(new Produto("Salame Italiano Fatiado Aurora 100g", new BigDecimal(9.99), "Frios", "Aki Tem", R.drawable.salame_italiano_fatiado_aurora_100g));
        produtos.add(new Produto("Linguiça Mista Defumada Perdigão 240g", new BigDecimal(5.99), "Frios", "Aki Tem", R.drawable.linguica_mista_defumada_perdigao_240g));
        produtos.add(new Produto("Linguiça Calabresa Defumada Perdigão 400g", new BigDecimal(7.99), "Frios", "Aki Tem", R.drawable.linguica_calabresa_defumada_perdigao_400g));
        produtos.add(new Produto("Mortadela Defumada Fatiado Sadia", new BigDecimal(4.59), "Frios", "Aki Tem", R.drawable.mortadela_defumada_fatiado_sadia));
        produtos.add(new Produto("Presunto Fatiado Sadia 200g", new BigDecimal(7.49), "Frios", "Aki Tem", R.drawable.presunto_fatiado_sadia_200g));
        produtos.add(new Produto("Linguiça Portuguesa Defumada Perdigão 400g", new BigDecimal(13.49), "Frios", "Aki Tem", R.drawable.linguica_portuguesa_defumada_perdigao_400g));
        produtos.add(new Produto("Salamitos Poket SADIA Pacote 36g", new BigDecimal(6.99), "Frios", "Aki Tem", R.drawable.salamitos_poket_sadia_pacote_36g));
    }

    public Produto getItemProduto(int pos){
        return produtos.get(pos);
    }
}
