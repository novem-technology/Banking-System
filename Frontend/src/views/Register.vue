<template>
  <div id="register-page">
    <Navbar/>
    <div class="container">
      <div class="row">
        <div class="col-4"></div>
        <div class="col-4">
          <div class="register-form panel">
            <div class="form-group">
              <label for="usr">Name:</label>
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
            <button v-on:click="handleSubmit()">Register</button>
          </div>
        </div>
        <div class="col-4"></div>
      </div>
    </div>
  </div>
</template>

<script>
import Vue from 'vue';
import Navbar from '@/components/Navbar.vue';
import { userService } from '../_services';
import router from '../router';

export default {
  components: {
    Navbar,
  },
  data() {
    return {
      customerName: '',
      username: '',
      email: '',
      password: '',
    };
  },
  methods: {

    handleSubmit(e) {
      this.submitted = true;
      const { customerName, username, email, password } = this;

      // stop here if form is invalid
      if (!(customerName && username && email && password)) {
        alert('Invalid registration data');
        return;
      }

      this.loading = true;
      userService.register(customerName, username, email, password)
        .then(
          (user) => router.push('/teller'),
          (error) => {
            this.error = error;
            this.loading = false;
            console.log(error);
            alert('Invalid credentials');
          },
        );
    },
  },
};
</script>

<style lang="scss">
#register-page {
  padding-top: 50px;
}

.register-form {
  padding-left: 10px;
  padding-right: 10px;
}
</style>

