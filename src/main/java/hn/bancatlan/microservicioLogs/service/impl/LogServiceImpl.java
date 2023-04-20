package hn.bancatlan.microservicioLogs.service.impl;

import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica.*;
import hn.bancatlan.microservicioLogs.exception.ServiceException;
import hn.bancatlan.microservicioLogs.service.LogsService;
import hn.bancatlan.microservicioLogs.dto.peticion.exposicion.especifica.*;
import hn.bancatlan.microservicioLogs.dto.respuesta.exposicion.especifica.RespuestaEspecifica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class LogServiceImpl implements LogsService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public ResponseEntity<RespuestaEspecifica> registraRespuesta(PeticionEspecificaRespuesta peticionEspecificaRespuesta) throws ServiceException {
        try{
            jdbcTemplate.batchUpdate("INSERT INTO MICRO.\"tbl_respuesta\"" +
                            "(\"token\", \"id_microservicio\", \"codigo_mensaje\", \"mensaje_respuesta\", \"codigo_peticion_unica\", \"tipo_transaccion\", \"tiempo_procesamiento\", \"fecha_respuesta\", \"hora_respuesta\", \"campo_adicional\", \"mensaje_respuesta_general\", \"respuesta_especifica\", \"extra1\", \"extra2\", \"extra3\") " +
                            "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                    peticionEspecificaRespuesta.getPeticionEspecificaRespuestaColeccion(),
                    peticionEspecificaRespuesta.getPeticionEspecificaRespuestaColeccion().size(),
                    (PreparedStatement ps, PeticionEspecificaRespuestaItem pet) -> {
                        String sDate1 = pet.getFecha_respuesta();

                        try {
                            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }

                        ps.setString(1, pet.getToken());
                        ps.setString(2, pet.getId_microservicio());
                        ps.setString(3, pet.getCodigo_mensaje());
                        ps.setString(4, pet.getMensaje_respuesta());
                        ps.setString(5, pet.getCodigo_peticion_unica());
                        ps.setString(6, pet.getTipo_transaccion());
                        ps.setString(7, pet.getTiempo_procesamiento());
                        ps.setString(8, sDate1);
                        ps.setString(9, pet.getHora_respuesta());
                        ps.setString(10, pet.getCampo_adicional());
                        ps.setString(11, pet.getMensaje_respuesta_general());
                        ps.setString(12, pet.getRespuesta_especifica());
                        ps.setInt(13, pet.getExtra1());
                        ps.setString(14, pet.getExtra2());
                        ps.setString(15, pet.getExtra3());
                     });
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            RespuestaEspecifica respuestaEspecifica = new RespuestaEspecifica();
            respuestaEspecifica.setCodigoRespuesta("99");
            respuestaEspecifica.setMensajeRespuesta(e.getMessage());
            return ResponseEntity.ok().body(respuestaEspecifica);

        }
        RespuestaEspecifica respuestaEspecifica = new RespuestaEspecifica();
        respuestaEspecifica.setCodigoRespuesta("00");
        respuestaEspecifica.setMensajeRespuesta("PROCESAMIENTO EXITOSO");
        return ResponseEntity.ok().body(respuestaEspecifica);

    }

    @Override
    public ResponseEntity<RespuestaEspecifica> registraBitacora(PeticionEspecificaBitacora peticionEspecificaBitacora) throws ServiceException {
        try{
            jdbcTemplate.batchUpdate("INSERT INTO MICRO.\"tbl_bitacora\"" +
                            "(\"token\", \"id_microservicio\", \"id_peticion_unica\", \"clase_bitacora\", \"metodo_bitacora\", \"data_bitacora\", \"tipo_registro\", \"hora\", \"fecha\", \"extra1\", \"extra2\", \"extra3\") " +
                            "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                    peticionEspecificaBitacora.getPeticionEspecificaBitacoraColeccion(),
                    peticionEspecificaBitacora.getPeticionEspecificaBitacoraColeccion().size(),
                    (PreparedStatement ps, PeticionEspecificaBitacoraItem pet) -> {
                        String sDate1 = pet.getFecha();
                        try {
                            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }
                        ps.setString(1, pet.getToken());
                        ps.setString(2, pet.getId_microservicio());
                        ps.setString(3, pet.getId_peticion_unica());
                        ps.setString(4, pet.getClase_bitacora());
                        ps.setString(5, pet.getMetodo_bitacora());
                        ps.setString(6, pet.getData_bitacora());
                        ps.setString(7, pet.getTipo_registro());
                        ps.setString(8, pet.getHora());
                        ps.setString(9, sDate1);
                        ps.setInt(10, pet.getExtra1());
                        ps.setString(11, pet.getExtra2());
                        ps.setString(12, pet.getExtra3());
                    });
        }catch (Exception e){
            System.out.println(e.getMessage());
            RespuestaEspecifica respuestaEspecifica = new RespuestaEspecifica();
            respuestaEspecifica.setCodigoRespuesta("99");
            respuestaEspecifica.setMensajeRespuesta(e.getMessage());
            return ResponseEntity.ok().body(respuestaEspecifica);
        }

        RespuestaEspecifica respuestaEspecifica = new RespuestaEspecifica();
        respuestaEspecifica.setCodigoRespuesta("00");
        respuestaEspecifica.setMensajeRespuesta("PROCESAMIENTO EXITOSO");
        return ResponseEntity.ok().body(respuestaEspecifica);
    }

    @Override
    public ResponseEntity<RespuestaEspecifica> registraPeticiones(PeticionEspecificaPeticiones peticionEspecificaPeticiones) throws ServiceException {
        try{
            jdbcTemplate.batchUpdate("INSERT INTO MICRO.\"tbl_peticiones\"" +
                            "(\"token\", \"id_servicio\", \"id_aplicacion\", \"id_pais\", \"id_institucion\", \"id_region\", \"id_motor\", \"idioma\", \"version\", \"llave_sesion\", \"id_usuario\", \"id_cliente_core\", \"id_dispositivo\", \"paso\", \"ambiente\"," +
                            "\"mandante\", \"codigo_peticion_unica\" , \"id_core\", \"id_agencia\", \"id_sucursal\", \"usuario_aplicacion\", \"direccion_ip\", \"tipo_procesamiento\", \"identificador_id_proceso\", \"identificador_referencia_bus\", \"iden_numero_transaccion\", \"identificador_tipo_transaccion\"," +
                            "\"parametro_adicional\", \"peticion_especifica\", \"fecha_peticion\", \"hora_peticion\", \"extra1\", \"extra2\", \"extra3\") " +
                            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                    peticionEspecificaPeticiones.getPeticionEspecificaPeticionesColeccion(),
                    peticionEspecificaPeticiones.getPeticionEspecificaPeticionesColeccion().size(),
                    (PreparedStatement ps, PeticionEspecificaPeticionesItem pet) -> {
                        String sDate1 = pet.getFecha_peticion();
                        try {
                            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }
                        ps.setString(1, pet.getToken());
                        ps.setString(2, pet.getId_servicio());
                        ps.setString(3, pet.getId_aplicacion());
                        ps.setString(4, pet.getId_pais());
                        ps.setString(5, pet.getId_institucion());
                        ps.setString(6, pet.getId_region());
                        ps.setString(7, pet.getId_motor());
                        ps.setString(8, pet.getIdioma());
                        ps.setString(9, pet.getVersion());
                        ps.setString(10, pet.getLlave_sesion());
                        ps.setString(11, pet.getId_usuario());
                        ps.setString(12, pet.getId_cliente_core());
                        ps.setString(13, pet.getId_dispositivo());
                        ps.setString(14, pet.getPaso());
                        ps.setString(15, pet.getAmbiente());
                        ps.setString(16, pet.getMandante());
                        ps.setString(17, pet.getCodigo_peticion_unica());
                        ps.setString(18, pet.getId_core());
                        ps.setString(19, pet.getId_agencia());
                        ps.setString(20, pet.getId_sucursal());
                        ps.setString(21, pet.getUsuario_aplicacion());
                        ps.setString(22, pet.getDireccion_ip());
                        ps.setString(23, pet.getTipo_procesamiento());
                        ps.setString(24, pet.getIdentificador_id_proceso());
                        ps.setString(25, pet.getIdentificador_referencia_bus());
                        ps.setString(26, pet.getIden_numero_transaccion());
                        ps.setString(27, pet.getIdentificador_tipo_transaccion());
                        ps.setString(28, pet.getParametro_adicional());
                        ps.setString(29, pet.getPeticion_especifica());
                        ps.setString(30, sDate1);
                        ps.setString(31, pet.getHora_peticion());
                        ps.setInt(32, pet.getExtra1());
                        ps.setString(33, pet.getExtra2());
                        ps.setString(34, pet.getExtra3());

                    });
        }catch (Exception e){
            System.out.println(e.getMessage());
            RespuestaEspecifica respuestaEspecifica = new RespuestaEspecifica();
            respuestaEspecifica.setCodigoRespuesta("99");
            respuestaEspecifica.setMensajeRespuesta(e.getMessage());
            return ResponseEntity.ok().body(respuestaEspecifica);
        }

        RespuestaEspecifica respuestaEspecifica = new RespuestaEspecifica();
        respuestaEspecifica.setCodigoRespuesta("00");
        respuestaEspecifica.setMensajeRespuesta("PROCESAMIENTO EXITOSO");
        return ResponseEntity.ok().body(respuestaEspecifica);
    }
}
