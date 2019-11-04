package br.com.etec.aula5.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import br.com.etec.aula5.data.BibliotecaDatabase
import br.com.etec.aula5.model.Usuario
import java.lang.Exception

class SaveUserWorker(var ctx: Context, params: WorkerParameters) : Worker(ctx, params) {
    override fun doWork(): Result {
        return try {
            var usr = Usuario(
                null,
                inputData.getString("nome")!!,
                inputData.getString("email")!!,
                inputData.getString("telefone")!!,
                inputData.getString("senha")!!
            )
            BibliotecaDatabase.getInstance(ctx)!!.UsuarioDao().insert(usr)
            Result.success(workDataOf("result" to "usuario salvo com sucesso!"))
        } catch (e: Exception) {
            Result.failure(workDataOf("result" to e.message))
        }


    }

}