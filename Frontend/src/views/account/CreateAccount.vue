<template>
  <div class="row">
    <ProfileNavbar />
    <div class="col-3"></div>
    <div class="col-6">
      <div class="container panel" style="padding-top: 20px">
        <div class="form-group">
          <label for="usr">AccountNumber:</label>
          <input type="text" v-model="customerName" class="form-control" id="usr">
        </div>
        <div class="form-group">
          <label for="usr">Username:</label>
          <input type="text" v-model="username" class="form-control" id="usr">
        </div>
        <div class="form-group">
          <label for="usr">Email:</label>
          <input type="text" v-model="email" class="form-control" id="usr">
        </div>
        <div class="form-group">
          <label for="usr">Password:</label>
          <input type="password" v-model="password" class="form-control" id="usr">
        </div>
        <div class="form-group">
          <label for="pwd">Repeat Password:</label>
          <input type="password" class="form-control" id="pwd">
        </div>
        <button class="btn btn-primary" v-on:click="handleSubmit()">Submit</button>
      </div>
    </div>
    <div class="col-3"></div>
  </div>
</template>

<script>
import ProfileNavbar from '@/components/ProfileNavbar.vue';

export default {
  components: {
    ProfileNavbar
  }
}
</script>